package com.disney.springbase.aop;

import org.springframework.stereotype.Service;

/**
 * 被拦截类，注解式
 */
@Service
public class DemoAnnotationService {

    @MyAction(name = "注解式拦截actin")
    public void add(){
        System.out.println("DemoAnnotationService.add");
    }

}
