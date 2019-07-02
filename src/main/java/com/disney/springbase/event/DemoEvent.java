package com.disney.springbase.event;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件
 * @author zhanx503
 * @date 2019-05-27 17:55
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }
}
