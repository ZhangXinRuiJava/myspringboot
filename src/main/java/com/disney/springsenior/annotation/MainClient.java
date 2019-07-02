package com.disney.springsenior.annotation;


import com.disney.springsenior.aware.AwareConfig;
import com.disney.springsenior.aware.AwareService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class MainClient {

    @Test
    public void testJavaConfig() throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputRes();

        context.close();
    }

}
