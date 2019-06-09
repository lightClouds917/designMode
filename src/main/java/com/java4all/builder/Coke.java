package com.java4all.builder;

/**
 * @author IT云清
 * @date 2019年01月01日 11:11:11
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
