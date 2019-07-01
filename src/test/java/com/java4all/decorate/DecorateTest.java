package com.java4all.decorate;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author wangzhongxiang
 * @date 2019年07月01日 21:15:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@Slf4j
public class DecorateTest {

    @Test
    public void testDecorate(){
        Circle circle = new Circle();
        ShapeDecorator shapeDecorator = new RedShapeDecorator(new Circle());

        circle.draw();
        shapeDecorator.draw();
    }

}
