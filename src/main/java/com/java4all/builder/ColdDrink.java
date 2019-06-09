package com.java4all.builder;

/**
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
