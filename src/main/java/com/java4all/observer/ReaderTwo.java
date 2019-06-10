package com.java4all.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wangzhongxiang
 * @date 2019年06月10日 10:06:01
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
     * 更新
     */
    @Override
    public void update() {
        log.info("ReaderTwo接收到了此次更新,接收文章为：{}",this.java4all.getArticleTitle());
    }
}
