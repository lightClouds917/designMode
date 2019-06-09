package com.java4all.builder;

/**
 * @author wangzhongxiang
 * @date 2019年06月09日 16:06:11
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
