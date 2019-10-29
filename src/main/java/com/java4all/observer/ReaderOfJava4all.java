package com.java4all.observer;

/**
 * java4all读者
 * 角色：抽象观察者
 *
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
public abstract class ReaderOfJava4all {

    /**目标，抽象观察者持有观察的目标对象*/
    public Java4all java4all;

    /**
     * 当关注的公众号更新文章时，会触发此方法
     * 接收
     */
    public abstract void receive();

}
