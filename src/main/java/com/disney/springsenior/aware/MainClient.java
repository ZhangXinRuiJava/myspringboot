package com.disney.springsenior.aware;


import com.disney.springbase.event.DemoEventPublisher;
import com.disney.springbase.event.EventConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class MainClient {

    @Test
    public void testJavaConfig() throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.output();

        context.close();
    }

}
