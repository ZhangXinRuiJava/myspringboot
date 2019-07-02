package com.disney.springbase.event;


import com.disney.springbase.el.ElConfig;
import com.disney.springbase.el.JavaConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClient {

    @Test
    public void testJavaConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoEventPublisher publisher = context.getBean(DemoEventPublisher.class);
        publisher.publish("测试消息");

        context.close();
    }

}
