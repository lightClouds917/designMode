package com.java4all.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 宝马
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
@Slf4j
public class BWM implements Car{

    /**
     * 跑
     */
    @Override
    public String run() {
        log.info("BWM run,百公里加速度5s");
        return "BWM";
    }
}
