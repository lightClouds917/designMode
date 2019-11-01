package com.java4all.state;

/**
 * @author IT云清
 */
public class StateB implements State{

    @Override
    public void handle(Object obj) {
        System.out.println("按照b实现处理bbb");
    }
}
