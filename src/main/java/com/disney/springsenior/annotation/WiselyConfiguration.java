package com.disney.springsenior.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * 将@ComponentScan，@Configuration两个注解合并
 * @author zhanx503
 * @date 2019-05-28 14:12
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ComponentScan
@Configuration
public @interface WiselyConfiguration {

    String[] value() default {};

}
