package com.java4all.decorate;


/**
 * 实现了形状接口的抽象装饰类
 *
 * @author IT云清
 * @date 2019年06月26日 20:19:52
 */
public  abstract class ShapeDecorator implements Shape{

    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
