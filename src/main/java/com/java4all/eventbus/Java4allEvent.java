package com.java4all.eventbus;

/**
 * https://www.cnblogs.com/peida/p/EventBus.html
 * 消息封装类
 * @author IT云清
 *
 * description:
 * 1.创建消息封装对象Java4allEvent；
 * 2.创建订阅者Java4allEventListener，添加接受消息后的处理逻辑；
 * 3.创建evenbus对象，订阅者向eventnbus注册listener;
 * 4.eventbut post推送消息；
 * 5.订阅者接收到eventbus推送的信息后做处理；
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
