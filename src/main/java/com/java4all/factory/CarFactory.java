package com.java4all.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

/**
 * 汽车工厂类
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
@Slf4j
public class CarFactory {

    public Car getCarByType(String carType){
        Car car = null;
        if(StringUtils.isEmpty(carType)){
            return null;
        }
        switch (carType){
            case "BWM":
                car =  new BWM();
                break;
            case "Benz":
                car = new Benz();
                break;
            case "Porsche":
                car = new Porsche();
                break;
            default:
                car = null;
                break;
        }
        return car;
    }
}
