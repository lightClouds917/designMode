package com.java4all.observer;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author wangzhongxiang
 * @date 2019年06月10日 10:18:34
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
