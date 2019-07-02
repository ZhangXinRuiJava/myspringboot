package com.disney.springbase.client;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClient {

    @Test
    public void testJavaConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        //UseFunctionService useFunctionService = (UseFunctionService) context.getBean("useFunctionService");
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("javaConfig,哈哈"));
    }

}
