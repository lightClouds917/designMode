package com.java4all.builder;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author wangzhongxiang
 * @date 2019年06月09日 16:29:42
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@Slf4j
public class MealBuilderTest {

    @Test
    public void testPrepareVegMeal(){
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareNonVegMeal();
        meal.showItems();
        log.info("total cost,{}",meal.getCost());
    }
}
