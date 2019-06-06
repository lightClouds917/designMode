package com.java4all.proxy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author wangzhongxiang
 * @date 2019年06月06日 16:01:54
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@Slf4j
public class UserServiceImplProxyTest {

    @Autowired
    private UserServiceImplStaticProxy userServiceImplStaticProxy;

    @Test
    public void testDoFirst(){
        String doFirst = userServiceImplStaticProxy.doFirst();
        String doSecond = userServiceImplStaticProxy.doSecond();
        log.info("doFirst:{}",doFirst);
        log.info("doSecond:{}",doSecond);
    }

}
