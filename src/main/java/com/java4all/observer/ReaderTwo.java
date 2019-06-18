package com.java4all.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * 读者2
 * 角色：具体观察者；
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
@Slf4j
public class ReaderTwo extends ReaderOfJava4all{

    /**
     * 创建读者时，直接关注java4all
     * @param java4all
     */
    public ReaderTwo(Java4all java4all) {
        this.java4all = java4all;
        this.java4all.attach(this);
    }

    /**
     * 接收
     */
    @Override
    public void receive() {
        log.info("ReaderTwo接收到了此次更新,接收文章为：{}",this.java4all.getArticleTitle());
    }
}
