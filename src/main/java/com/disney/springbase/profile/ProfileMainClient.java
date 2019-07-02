package com.disney.springbase.profile;


import com.disney.springbase.life.BeanWayService;
import com.disney.springbase.life.JSR250WayService;
import com.disney.springbase.life.LifeConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileMainClient {

    @Test
    public void testJavaConfig(){
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("dev");
        context.register(JavaConfig.class);
        context.refresh();
        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        context.close();
    }

}
