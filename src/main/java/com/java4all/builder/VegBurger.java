package com.java4all.builder;

/**
 * @author IT云清
 * @date 2019年01月01日 11:11:11
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
