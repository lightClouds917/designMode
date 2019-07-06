package com.java4all.responsibility;

/**
 * 责任链模式
 *
 * 抽象日志记录对象
 * @author wangzhongxiang
 * @date 2019年07月06日 16:45:56
 */
public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    /**日志级别*/
    protected int level;

    /**责任链中的下一个节点*/
    protected AbstractLogger nextLogger;

    public void setNextAbstractLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level,String message){
        if(this.level <= level){
            this.write(message);
        }
        if(null != nextLogger){
            nextLogger.logMessage(level,message);
        }
    }

    abstract protected void write(String message);
}
