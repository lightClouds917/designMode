package com.java4all.proxy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 测试cglib动态代理
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@Slf4j
public class TeacherServiceCglibProxyTest {


    @Test
    public void test(){
        TeacherService teacherService = new TeacherService();
        log.info(teacherService.doFirst());
        TeacherServiceCglibProxy teacherServiceCglibProxy =
                new TeacherServiceCglibProxy(teacherService);
        TeacherService teacherService1 = teacherServiceCglibProxy.cglibCreator();
        log.info(teacherService1.doFirst());
    }
}
