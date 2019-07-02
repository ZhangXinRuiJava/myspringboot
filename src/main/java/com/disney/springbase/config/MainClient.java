package com.disney.springbase.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClient {

    @Test
    public void testJavaConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("javaConfig,哈哈"));
    }

}
