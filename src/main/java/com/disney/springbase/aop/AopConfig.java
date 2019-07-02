package com.disney.springbase.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Java配置
 * @author zhanx503
 * @date 2019-05-24 14:59
*/
@Configuration
@ComponentScan("com.disney.springbase.aop")
@EnableAspectJAutoProxy //启用spring对aspectj的支持，否则aop不起作用
public class AopConfig {
}
