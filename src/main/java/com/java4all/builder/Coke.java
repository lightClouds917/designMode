package com.java4all.builder;

/**
 * @author wangzhongxiang
 * @date 2019年06月09日 16:20:41
 */
public class Coke extends ColdDrink{

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
