package com.disney.springsenior.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhanx503
 * @date 2019-05-28 13:35
 */
@Configuration
@ComponentScan("com.disney.springsenior.conditional")
public class ConditionalConfig {

    /*@Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService(){
        return new WindowsListSerivce();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService(){
        return new LinuxListService();
    }

    @Bean
    @Conditional(OSXCondition.class)
    public ListService OSXListService(){
        return new OSXListService();
    }*/

}
