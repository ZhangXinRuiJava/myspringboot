package com.disney.springbase.life;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author zhanx503
 * @date 2019-05-27 11:12
 */
public class JSR250WayService {

    public JSR250WayService() {
        System.out.println("JSR250WayService的构造方法");
    }

    @PostConstruct
    public void initha(){
        System.out.println("JSR initha()");
    }

    @PreDestroy
    public void destroyha(){
        System.out.println("JSR destroyha()");
    }

}
