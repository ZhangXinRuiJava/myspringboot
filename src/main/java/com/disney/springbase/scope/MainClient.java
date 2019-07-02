package com.disney.springbase.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Properties;

/**
 * @author zhanx503
 * @date 2019-05-24 15:37
 */
public class MainClient {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService singletonService01 = context.getBean(DemoSingletonService.class);
        DemoSingletonService singletonService02 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService prototypeService01 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService prototypeService02 = context.getBean(DemoPrototypeService.class);

        System.out.println("singletonService01.equals(singletonService02):"+singletonService01.equals(singletonService02));
        System.out.println("prototypeService01.equals(prototypeService02):"+prototypeService01.equals(prototypeService02));

    }

}
