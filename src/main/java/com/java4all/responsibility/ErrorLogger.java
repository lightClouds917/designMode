package com.java4all.responsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * error级别
 * @author IT云清
 * @date 2019年07月06日 17:02:13
 */
@Slf4j
public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        log.info("Error level message console:{}",message);
    }

}
