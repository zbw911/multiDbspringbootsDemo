package com.zhangbaowei.multidbtempl;

import com.zhangbaowei.multidbtempl.db.DynamicDataSourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Import({DynamicDataSourceRegister.class})
public class TemplApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplApplication.class, args);
    }
}
