package com.disney.springbase.aop;

import java.lang.annotation.*;

/**
 * @author zhanx503
 * @date 2019-05-24 14:48
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAction {

    String name();

}
