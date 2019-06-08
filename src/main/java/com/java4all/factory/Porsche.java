package com.java4all.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 保时捷
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
@Slf4j
public class Porsche implements Car{

    /**
     * 跑
     */
    @Override
    public String run() {
        log.info("Porsche run,百公里加速度3s");
        return "Porsche";
    }
}
