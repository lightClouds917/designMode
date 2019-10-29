package com.java4all.eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * @author IT云清
 */
public class Java4allEventListener {

    private String message;

    @Subscribe
    public void listen(Java4allEvent event){
        message = event.getMessage();
        System.out.println("Java4allEventListener接收到了消息："+message);
    }

    public String getMessage() {
        return message;
    }
}
