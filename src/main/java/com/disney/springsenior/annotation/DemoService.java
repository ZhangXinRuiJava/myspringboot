package com.disney.springsenior.annotation;

import org.springframework.stereotype.Service;

/**
 * @author zhanx503
 * @date 2019-05-28 14:11
 */
@Service
public class DemoService {

    public void outputRes(){
        System.out.println("组合注解和元注解，结果");
    }

}
