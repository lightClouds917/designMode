package com.java4all.strategy;

/**
 * 金额计算器
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
public class MoneyCalculator {
    private Arithmetic arithmetic;

    public MoneyCalculator(Arithmetic arithmetic) {
        this.arithmetic = arithmetic;
    }

    public Integer execute(Integer num1,Integer num2){
        return arithmetic.execute(num1,num2);
    }
}
