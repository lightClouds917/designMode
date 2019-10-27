package com.java4all.strategy;

import com.java4all.strategy.strategy2.Validator;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author wangzhongxiang
 * @date 2019年10月27日 09:58:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@Slf4j
public class Strategy2Test {

    //java8 strategy

    @Test
    public void testValidate(){
        Validator validator = new Validator((String var) -> var.matches("[a-z]+"));
        boolean aaaVVV = validator.validator("aaaVVV");
        System.out.println(aaaVVV);

        Validator validator1 = new Validator((String var) -> var.matches("\\d+"));
        boolean aaa = validator1.validator("aaa");
        System.out.println(aaa);
    }
}
