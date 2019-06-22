package com.java4all.strategy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 策略模式测试
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@Slf4j
public class StrategyTest {

    @Test
    public void testStrategy(){
        MoneyCalculator moneyCalculator = new MoneyCalculator(new OperationAdd());
        moneyCalculator.execute(100,50);

        MoneyCalculator moneyCalculator1 = new MoneyCalculator(new OperationSubstract());
        moneyCalculator1.execute(100,50);

        MoneyCalculator moneyCalculator2 = new MoneyCalculator(new OperationMultiply());
        moneyCalculator2.execute(100,50);
    }
}
