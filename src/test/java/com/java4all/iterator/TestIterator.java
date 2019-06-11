package com.java4all.iterator;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 测试迭代器
 * @author IT云清测试
 * @date 2019年01月01日 11:11:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@Slf4j
public class TestIterator {

    @Test
    public void testIterator(){
        TitleCollection titleCollection = new TitleCollection();
        IteratorNew iteratorNew = titleCollection.getIteratorNew();
        while (iteratorNew.hasNext()){
            log.info(iteratorNew.next().toString());
        }
    }
}
