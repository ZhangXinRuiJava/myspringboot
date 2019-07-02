package com.disney.springbase.life;

/**
 * @author zhanx503
 * @date 2019-05-27 10:43
 */
public class BeanWayService {

    public BeanWayService() {
        System.out.println("@Bean BeanWayService的构造方法");
    }

    public void initha(){
        System.out.println("@Bean initha()");
    }

    public void destroyha(){
        System.out.println("@Bean destroyha()");
    }
}
