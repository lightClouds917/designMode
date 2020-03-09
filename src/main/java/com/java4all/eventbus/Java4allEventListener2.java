package com.java4all.eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * 消息接收类
 * @author IT云清
 */
public class Java4allEventListener2 {

    private String message;

    @Subscribe
    public void listen(Java4allEvent event){
        message = event.getMessage();
        System.out.println("Java4allEventListener2接收到了消息："+message);
    }

}
