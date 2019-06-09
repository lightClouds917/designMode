package com.java4all.builder;

/**
 * 表示食物条目和食物包装的
 * @author wangzhongxiang
 * @date 2019年06月09日 15:59:22
 */
public interface Item {

    String name();

    Packing packing();

    float price();


}
