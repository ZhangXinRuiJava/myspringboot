package com.disney.springsenior.conditional;


import com.disney.springsenior.aware.AwareConfig;
import com.disney.springsenior.aware.AwareService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class MainClient {

    @Test
    public void testJavaConfig() throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionalConfig.class);
        ListService listService = context.getBean(ListService.class);

        System.out.println(context.getEnvironment().getProperty("os.name"));//Mac OS X
        listService.showListCmd();

        context.close();
    }

}
