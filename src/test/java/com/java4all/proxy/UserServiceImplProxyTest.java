package com.java4all.proxy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 测试静态代理
 * @author IT云清
 * @date 2019年01月01日 11:11:11
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
