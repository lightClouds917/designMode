package com.java4all.builder;

/**
 * @author wangzhongxiang
 * @date 2019年06月09日 16:21:22
 */
public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
