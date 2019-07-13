package com.java4all.responsibility;

import org.junit.Test;

/**
 * 测试责任链模式
 * @author IT云清
 * @date 2019年07月06日 17:09:19
 */
public class ResponsibilityTest {

    @Test
    public void testResponsibility(){
        AbstractLogger loggerChain = this.getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.ERROR,"这里出error级别的问题了");
        loggerChain.logMessage(AbstractLogger.INFO,"这里出info级别的问题了");
    }

    private AbstractLogger getChainOfLoggers(){
        InfoLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        DebugLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        errorLogger.setNextAbstractLogger(debugLogger);
        debugLogger.setNextAbstractLogger(infoLogger);

        return errorLogger;
    }
}
