package com.disney.springbase.profile;

import com.disney.springbase.life.BeanWayService;
import com.disney.springbase.life.JSR250WayService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author zhanx503
 * @date 2019-05-27 10:46
 */
@Configuration
public class JavaConfig {

    @Bean
    @Profile("dev")
    public DemoBean getBeanWayService(){
        return new DemoBean("develop");
    }

    @Bean
    @Profile("prod")
    public DemoBean getJSR250WayService(){
        return new DemoBean("product");
    }

}
