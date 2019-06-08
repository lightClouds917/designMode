package com.java4all.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 奔驰
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
@Slf4j
public class Benz implements Car{

    /**
     * 跑
     */
    @Override
    public String run() {
        log.info("Benz run,百公里加速度4s");
        return "Benz";
    }
}
