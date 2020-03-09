package com.java4all.eventbus;

import com.google.common.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 消息接收类
 * @author IT云清
 */
public class Java4allEventListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(Java4allEventListener.class);


    private String message;

    @Subscribe
    public void listen(Java4allEvent event){
        message = event.getMessage();
        Integer messageInt = event.getMessageInt();
        LOGGER.info("Java4allEventListener接收到了消息:message={}",messageInt);
    }

    @Subscribe
    public void listen(Java4allEventSubClass subEvent){
        LOGGER.info("Java4allEventListener接受到了消息:message={},messageInt={},subInfo={}",
                subEvent.getMessage(),subEvent.getMessageInt(),subEvent.getSubInfo());
    }

}
