package com.disney.springbase.life;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhanx503
 * @date 2019-05-27 10:46
 */
@Configuration
public class LifeConfig {

    @Bean(initMethod = "initha",destroyMethod = "destroyha")
    public BeanWayService getBeanWayService(){
        return new BeanWayService();
    }

    @Bean
    public JSR250WayService getJSR250WayService(){
        return new JSR250WayService();
    }

}
