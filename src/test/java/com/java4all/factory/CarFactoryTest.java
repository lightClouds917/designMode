package com.java4all.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 测试汽车工厂类
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@Slf4j
public class CarFactoryTest {

    /**
     * 测试汽车生产工厂
     */
    @Test
    public void testCarFactory(){
        CarFactory carFactory = new CarFactory();
        BWM bmw = (BWM) carFactory.getCarByType("BWM");
        Assert.assertEquals("BWM",bmw.run());
    }

}
