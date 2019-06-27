package com.java4all.decorate;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author wangzhongxiang
 * @date 2019年06月27日 20:32:04
 */
@Slf4j
public class RedShapeDecorator extends ShapeDecorator{


    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        this.setRedBorder();
    }

    public void setRedBorder(){
        log.info("Border Color:Red!!!");
    }
}
