package com.java4all.eventbus;

import com.google.common.eventbus.EventBus;
import com.java4all.BaseTest;
import org.junit.Test;

/**
 * @author IT云清
 */
public class TestEventbus extends BaseTest{

    @Test
    public void testReceive(){
        EventBus eventBus = new EventBus("第一次");
        Java4allEventListener listener = new Java4allEventListener();
        Java4allEventListener2 listener2 = new Java4allEventListener2();
        eventBus.register(listener);
        eventBus.register(listener2);

        eventBus.post(new Java4allEvent("第一次推送消息 from java4all"));
//        eventBus.post(new Java4allEvent("第二次推送消息 from java4all"));
//        eventBus.post(new Java4allEvent("第三次推送消息 from java4all"));

    }

}
