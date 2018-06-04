package com.zhangbaowei.multidbtempl.db;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.ProxyMethodInvocation;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Aspect
@Component
public class DataSourceAspect {

    @Around("execution(* com.zhangbaowei.multidbtempl.mapper.*.*(..)) )")
//    @Around("@annotation(DS)")
    public Object beforeMapper(ProceedingJoinPoint joinPoint) throws Throwable {

        if (joinPoint instanceof MethodInvocationProceedingJoinPoint) {
            String dataSource = DataSourceContextHolder.DEFAULT_DS;
            MethodInvocationProceedingJoinPoint methodInvocationProceedingJoinPoint = (MethodInvocationProceedingJoinPoint) joinPoint;
            Field f = methodInvocationProceedingJoinPoint.getClass().getDeclaredField("methodInvocation");
            f.setAccessible(true);
            ProxyMethodInvocation iWantThis = (ProxyMethodInvocation) f.get(methodInvocationProceedingJoinPoint);

            Method method = iWantThis.getMethod();
            Class<?> declaringClass = method.getDeclaringClass();
            if (method.isAnnotationPresent(DS.class)) {
                DS annotation = method.getAnnotation(DS.class);
                // 取出注解中的数据源名
                dataSource = annotation.value();
                DataSourceContextHolder.setDs(dataSource);
            } else if (declaringClass.isAnnotationPresent(DS.class)) {
                DS annotation = declaringClass.getAnnotation(DS.class);
                // 取出注解中的数据源名
                dataSource = annotation.value();
                DataSourceContextHolder.setDs(dataSource);
            } else {
                DataSourceContextHolder.setDs(dataSource);
            }
        }
        Object result = joinPoint.proceed();
        DataSourceContextHolder.cleanDs();
        return result;
    }
}