package com.java4all.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author wangzhongxiang
 * @date 2019年06月22日 11:03:31
 */
public class VersionInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler) throws Exception {
        String thisVersion = request.getParameter("thisVersion");
        System.out.println("aaa");

        return false;
    }
}
