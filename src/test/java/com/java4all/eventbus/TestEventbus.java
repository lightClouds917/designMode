package com.java4all.eventbus;

import com.google.common.eventbus.EventBus;
import com.java4all.BaseTest;
import com.java4all.observer.Java4all;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * eventbus测试类
 * @author IT云清
 */
public class TestEventbus extends BaseTest{
    private static final Logger LOGGER = LoggerFactory.getLogger(TestEventbus.class);

    @Test
    public void testReceive(){
        EventBus eventBus = new EventBus("第一次");
        Java4allEventListener listener = new Java4allEventListener();
        Java4allEventListener2 listener2 = new Java4allEventListener2();
        //注册订阅者，以接受事件
        eventBus.register(listener);
        eventBus.register(listener2);

        eventBus.post(new Java4allEvent("第一次推送消息 from java4all", 3));
        
        System.out.println("----------------------");

        Java4allEventListener listener3 = new Java4allEventListener();
        eventBus.register(listener3);
        eventBus.post(new Java4allEventSubClass("父类message",55,"子类info"));
    }

}
