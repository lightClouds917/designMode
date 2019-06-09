package com.java4all.builder;

/**
 * @author wangzhongxiang
 * @date 2019年06月09日 16:15:24
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
