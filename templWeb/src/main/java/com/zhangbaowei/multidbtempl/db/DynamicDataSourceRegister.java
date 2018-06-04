package com.zhangbaowei.multidbtempl.db;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotationMetadata;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DynamicDataSourceRegister
        implements ImportBeanDefinitionRegistrar, EnvironmentAware {

    Map<Object, Object> targetDataSources = new HashMap<Object, Object>();
    private DataSource defaultDataSource;

    @Override
    public void setEnvironment(Environment environment) {

        RelaxedPropertyResolver propertyResolver = new RelaxedPropertyResolver(environment, "spring.datasource.");

        Map<String, Object> subProperties = propertyResolver.getSubProperties("");

        List<String> collect = subProperties.keySet().stream()
                .map(x -> Arrays.stream(x.split("\\.")).findFirst().get()).distinct()
                .collect(Collectors.toList());

        DataSourceContextHolder.setetDefaultDS(collect.get(0));

        defaultDataSource = buildDataSource(collect.get(0), propertyResolver);

        collect.stream().skip(1).forEach(x ->
                {
                    targetDataSources.put(x, buildDataSource(x, propertyResolver));
                }
        );
    }

    private DataSource buildDataSource(String dsName, RelaxedPropertyResolver propertyResolver) {
        Map<String, Object> subProperties1 = propertyResolver.getSubProperties(dsName + ".");
        return buildDataSource(subProperties1);
    }

    public DataSource buildDataSource(Map<String, Object> dsMap) {
        String driverClassName = dsMap.get("driver-class-name").toString();
        String url = dsMap.get("url").toString();
        String username = dsMap.get("username").toString();
        String password = dsMap.get("password").toString();

        DataSourceBuilder factory = DataSourceBuilder.create().driverClassName(driverClassName).url(url)
                .username(username).password(password);
        factory = factory.type(factory.findType());
        return factory.build();
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        // 创建DynamicDataSource
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(DynamicDataSource.class);
        beanDefinition.setSynthetic(true);
        MutablePropertyValues mpv = beanDefinition.getPropertyValues();
        mpv.addPropertyValue("defaultTargetDataSource", defaultDataSource);
        mpv.addPropertyValue("targetDataSources", targetDataSources);
        beanDefinitionRegistry.registerBeanDefinition("dataSource", beanDefinition);
//
//        logger.info("Dynamic DataSource Registry");
    }
}
