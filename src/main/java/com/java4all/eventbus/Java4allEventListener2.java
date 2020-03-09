package com.java4all.eventbus;

import com.google.common.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 消息接收类
 * @author IT云清
 */
public class Java4allEventListener2 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Java4allEventListener2.class);


    private String message;

    @Subscribe
    public void listen(Java4allEvent event){
        message = event.getMessage();
        LOGGER.info("Java4allEventListener2接收到了消息:message={}",message);
    }

}
