package com.java4all.filter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */

@Slf4j
public class AuthenticationFilter implements Filter {

    @Override
    public void execute(String request) {
        log.info("认证拦截器：{}",request);
    }
}
