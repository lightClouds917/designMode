package com.java4all.decorate;


/**
 * @author wangzhongxiang
 * @date 2019年06月26日 20:19:52
 */
public class ShapeDecorator implements Shape{

    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
