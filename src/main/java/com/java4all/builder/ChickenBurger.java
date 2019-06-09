package com.java4all.builder;

/**
 * @author wangzhongxiang
 * @date 2019年06月09日 16:18:56
 */
public class ChickenBurger extends Burger{

    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
