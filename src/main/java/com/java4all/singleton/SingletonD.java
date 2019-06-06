package com.java4all.singleton;

/**
 * 单例模式：静态内部类
 * 特点：利用静态内部类
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
@SuppressWarnings("all")
public class SingletonD {

    private SingletonD() {}

    /**
     * 静态内部类
     */
    private static class SingletonDHolder{
        private static final SingletonD singletonD = new SingletonD();
    }

    /**
     * 对外暴漏唯一接口，提供单例对象
     * @return
     */
    public static SingletonD getSingletonD(){
        return SingletonDHolder.singletonD;
    }

}
