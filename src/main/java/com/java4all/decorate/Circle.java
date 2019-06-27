package com.java4all.decorate;

import lombok.extern.slf4j.Slf4j;

/**圆形
 * @author wangzhongxiang
 * @date 2019年06月26日 20:18:41
 */
@Slf4j
public class Circle implements Shape{

    @Override
    public void draw() {
        log.info("Shape: Circle 圆形");
    }
}
