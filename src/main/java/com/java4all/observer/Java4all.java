package com.java4all.observer;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * java4all公众号
 * 角色：被观察者
 * 读者订阅了此公众号（可以理解为：观察者观察此主题）
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
@Slf4j
public class Java4all {

    /**java4all公众号的订阅者*/
    private List<ReaderOfJava4all> readers = new ArrayList<>();

    /**
     * 添加读者
     * @param readerOfJava4all
     */
    public void attach(ReaderOfJava4all  readerOfJava4all){
        readers.add(readerOfJava4all);
    }

    /**
     * 通知所有读者
     */
    private void notifyAllReader() {
        readers.stream().forEach(readerOfJava4all -> {
            readerOfJava4all.receive();
        });
    }

    private String articleTitle;

    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * 更新文章时，通知所有读者
     * @param articleTitle 新文章标题
     */
    public void setArticleTitle(String articleTitle) {
        log.info("java4all更新文章了，标题为：{}",articleTitle);
        this.articleTitle = articleTitle;
        log.info("更新文章后通知所有的读者");
        this.notifyAllReader();
    }
}
