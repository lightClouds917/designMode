package com.java4all.proxy;

import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author wangzhongxiang
 * @date 2019年06月06日 17:22:00
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
        TeacherServiceCglibProxy teacherServiceCglibProxy = new TeacherServiceCglibProxy(
                teacherService);
        TeacherService teacherService1 = teacherServiceCglibProxy.cglibCreator();
        log.info(teacherService1.doFirst());
    }
}
