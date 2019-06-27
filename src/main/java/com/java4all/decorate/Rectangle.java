package com.java4all.decorate;

import lombok.extern.slf4j.Slf4j;

/** 长方形
 * @author wangzhongxiang
 * @date 2019年06月26日 20:14:47
 */
@Slf4j
public class Rectangle implements Shape{

    @Override
    public void draw() {
        log.info("Shape: Rectangle 长方形");
    }
}
