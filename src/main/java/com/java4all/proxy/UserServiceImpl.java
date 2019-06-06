package com.java4all.proxy;

import org.springframework.stereotype.Service;

/**
 * 接口实现类
 * 目标类，待增强
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
@Service("userServiceImpler")
public class UserServiceImpl implements UserService{

    @Override
    public String doFirst() {
        return "doFirst返回";
    }

    @Override
    public String doSecond() {
        return "doSecond返回";
    }
}
