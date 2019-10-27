package com.java4all.strategy.strategy2;

/**
 * @author wangzhongxiang
 * @date 2019年10月27日 09:55:59
 */
public class Validator {
    private ValidateStrategy validateStrategy;

    public Validator(ValidateStrategy validateStrategy) {
        this.validateStrategy = validateStrategy;
    }

    public boolean validator(String var){
        return validateStrategy.execute(var);
    }

}
