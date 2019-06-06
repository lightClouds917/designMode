package com.java4all.singleton;

/**
 * 单例模式：饿汉式
 * 特点：类初始化时就会自行实例化对象
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
@SuppressWarnings("all")
public class SingletonA {

    private static final SingletonA singletonA = new SingletonA();

    /**
     * 私有构造函数
     */
    private SingletonA() {}

    /**
     * 对外暴漏唯一接口，提供单例对象
     * @return
     */
    public static SingletonA getSingletonA(){
        return singletonA;
    }

}
