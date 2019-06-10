package com.java4all.observer;

/**
 * 抽象观察者
 * java4all读者
 *
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
public abstract class ReaderOfJava4all {

    public Java4all java4all;

    /**
     * 当关注的公众号更新文章时，会触发此方法
     * 接收
     */
    public abstract void receive();

}
