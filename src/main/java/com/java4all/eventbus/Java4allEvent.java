package com.java4all.eventbus;

/**
 * https://www.cnblogs.com/peida/p/EventBus.html
 * 消息封装类
 * @author IT云清
 */
public class Java4allEvent {
    private final String message;

    private final Integer messageInt;

    public Java4allEvent(String message, Integer messageInt) {
        this.message = message;
        this.messageInt = messageInt;
    }

    public String getMessage() {
        return message;
    }

    public Integer getMessageInt() {
        return messageInt;
    }
}
