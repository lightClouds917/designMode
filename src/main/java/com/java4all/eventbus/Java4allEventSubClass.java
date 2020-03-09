package com.java4all.eventbus;

/**
 * @author IT云清
 * 如果Listener A监听Event A, 而Event A有一个子类Event B, 此时Listener A将同时接收Event A和B消息
 */
public class Java4allEventSubClass extends Java4allEvent{

    private String subInfo;

    public Java4allEventSubClass(String message, Integer messageInt, String subInfo) {
        super(message, messageInt);
        this.subInfo = subInfo;
    }

    public Java4allEventSubClass(String message, Integer messageInt) {
        super(message, messageInt);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public Integer getMessageInt() {
        return super.getMessageInt();
    }

    public String getSubInfo() {
        return subInfo;
    }
}
