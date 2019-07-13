package com.java4all.responsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * info级别
 * @author IT云清
 * @date 2019年07月06日 16:57:58
 */
@Slf4j
public class InfoLogger extends AbstractLogger{

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        log.info("Info level message console:{}",message);
    }
}
