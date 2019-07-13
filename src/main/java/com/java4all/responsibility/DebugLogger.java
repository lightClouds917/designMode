package com.java4all.responsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * debug级别
 * @author IT云清
 * @date 2019年07月06日 17:00:09
 */
@Slf4j
public class DebugLogger extends AbstractLogger{

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        log.info("Debug level message console:{}",message);
    }
}
