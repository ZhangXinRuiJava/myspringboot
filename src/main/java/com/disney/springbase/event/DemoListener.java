package com.disney.springbase.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 自定义事件监听器
 * @author zhanx503
 * @date 2019-05-27 17:58
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("DemoListener收到了："+msg);
    }
}
