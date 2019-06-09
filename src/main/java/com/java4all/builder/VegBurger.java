package com.java4all.builder;

/**
 * @author wangzhongxiang
 * @date 2019年06月09日 16:17:38
 */
public class VegBurger extends Burger{

    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
