package com.disney.springbase.el;


import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClient {

    @Test
    public void testJavaConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        ElConfig elConfig = context.getBean(ElConfig.class);
        System.out.println(elConfig);
    }

}
