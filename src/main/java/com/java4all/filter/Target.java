package com.java4all.filter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wangzhongxiang
 * @date 2019年06月13日 21:23:04
 */
@Slf4j
public class Target {

    public void execute(String request){
        log.info("执行了请求：{}",request);
    }
}
