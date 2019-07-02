package com.disney.springbase.life;


import com.disney.springbase.el.ElConfig;
import com.disney.springbase.el.JavaConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeMainClient {

    @Test
    public void testJavaConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifeConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);

        context.close();
    }

}
