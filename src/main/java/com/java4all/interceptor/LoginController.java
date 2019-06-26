package com.java4all.interceptor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzhongxiang
 * @date 2019年06月22日 11:30:18
 */
@RestController
public class LoginController {

    @GetMapping(value = "/ios/login")
    public String test1(String thisVersion){

        return "/ios/login";
    }

    @GetMapping(value = "/ios2/login")
    public String test2(String thisVersion){
        return "/ios2/login";
    }

    @GetMapping(value = "/android/login")
    public String test3(String thisVersion){
        return "/android/login";
    }
}
