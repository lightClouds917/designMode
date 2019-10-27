package com.java4all.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 乘法
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
@Slf4j
public class OperationMultiply implements Arithmetic{

    @Override
    public Integer execute(Integer num1, Integer num2) {
        Integer result = num1 * num2;
        log.info("OperationMultiply: num1 * num2 = "+ result);
        return result;
    }
}
