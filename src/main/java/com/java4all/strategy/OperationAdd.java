package com.java4all.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wangzhongxiang
 * @date 2019年06月22日 17:09:07
 */
@Slf4j
public class OperationAdd implements Arithmetic{

    @Override
    public Integer doOperation(Integer num1, Integer num2) {
        Integer result = num1 + num2;
        log.info("OperationAdd: num1 + num2 = "+ result);
        return result;
    }
}
