package com.java4all.decorate;

import com.java4all.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author wangzhongxiang
 * @date 2019年07月01日 21:15:00
 */
@Slf4j
public class DecorateTest extends BaseTest{

    @Test
    public void testDecorate(){
        Circle circle = new Circle();
        ShapeDecorator shapeDecorator = new RedShapeDecorator(new Circle());

        circle.draw();
        log.info("----------------");
        shapeDecorator.draw();
    }

}
