package com.java4all.singleton;

/**
 * 单例模式：懒汉式
 * 特点：第一次调用时实例化对象
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
@SuppressWarnings("all")
public class SingletonB {

    private static SingletonB singletonB;

    /**
     * 私有构造函数
     */
    private SingletonB() {}

    /**
     * 对外暴漏唯一接口，提供单例对象
     * 防止并发下多个实例，加锁
     * @return
     */
    public static synchronized SingletonB getSingletonB(){
        if(null == singletonB){
            singletonB = new SingletonB();
        }
        return singletonB;
    }

}
