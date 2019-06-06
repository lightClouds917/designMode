package com.java4all.proxy;

import org.springframework.stereotype.Service;

/**
 * 静态代理
 * 增强 UserServiceImpl
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
@Service("userServiceImplProxy")
public class UserServiceImplStaticProxy implements UserService{

    @Override
    public String doFirst() {
        UserServiceImpl userService = new UserServiceImpl();
        String s = userService.doFirst();
        //增强处理
        s = s + "  doFirst 增强后";
        return s;
    }

    @Override
    public String doSecond() {
        UserServiceImpl userService = new UserServiceImpl();
        return userService.doSecond();
    }
}
