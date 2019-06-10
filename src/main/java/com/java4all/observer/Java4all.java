package com.java4all.observer;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * java4all公众号
 * @author wangzhongxiang
 * @date 2019年06月10日 09:47:28
 */
@Slf4j
public class Java4all {

    private List<ReaderOfJava4all> readers = new ArrayList<>();

    private String articleTitle;

    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * 更新文章时，通知所有读者
     * @param articleTitle 新文章标题
     */
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
        log.info("java4all更新文章了，标题为：{}",articleTitle);
        this.notifyAllReader();
        log.info("更新文章后通知所有的读者");
    }

    /**
     * 通知所有读者
     */
    private void notifyAllReader() {
        readers.stream().forEach(readerOfJava4all -> {
            readerOfJava4all.update();
        });
    }
}
