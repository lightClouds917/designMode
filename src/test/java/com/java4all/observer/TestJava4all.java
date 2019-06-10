package com.java4all.observer;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 测试观察者模式
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@Slf4j
public class TestJava4all {

    @Test
    public void testNotifyAllReader(){
        Java4all java4all = new Java4all();
        new ReaderOne(java4all);
        new ReaderTwo(java4all);

        java4all.setArticleTitle("分布式事务之--2pc");
        java4all.setArticleTitle("分布式事务之--3pc");
    }
}
