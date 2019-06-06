package com.java4all.singleton;

/**
 * 单例模式：双重检验
 * 特点：加锁，双重检验
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
@SuppressWarnings("all")
public class SingletonC {

    /**
     * volatile防止指令重排
     * 考虑的是，new关键字在虚拟机中执行时其实分为很多步骤,而volatile关键字可以防止指令重排。
     */
    private static volatile SingletonC singletonC;

    /**
     * 私有构造函数
     */
    private SingletonC() {}


    /**
     * 对外暴漏唯一接口，提供单例对象
     *
     * 只是在实例为空时才进行同步创建
     * 为什么做了2次判断？
     * A线程和B线程同时进入同步方法0
     * 然后都在1位置处判断了实例为null
     * 然后都进入了同步块2中
     * 然后A线程优先进入了同步代码块2中（B线程也进入了），然后创建了实例
     * 此时，如果没有3处的判断，那么A线程创建实例同时，B线程也会创建一个实例
     * 所以，还需要做2次判断
     * @return
     */
    public static SingletonC getSingletonC(){//0
        if(null == singletonC){//1
            synchronized (SingletonC.singletonC){//2
                if(null == singletonC){//3
                    singletonC = new SingletonC();//4
                }
            }
        }
        return singletonC;
    }

}
