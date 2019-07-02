package com.disney.springbase.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 自定义事件发布器
 * @author zhanx503
 * @date 2019-05-28 09:36
 */
@Component
public class DemoEventPublisher {

    @Autowired
    private ApplicationContext context;

    public void publish(String msg){
        context.publishEvent(new DemoEvent(this,msg));
    }

}
