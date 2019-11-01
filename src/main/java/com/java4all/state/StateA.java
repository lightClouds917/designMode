package com.java4all.state;

/**
 * @author IT云清
 */
public class StateA implements State{


    @Override
    public void handle(Object obj) {
        System.out.println("按照a实现处理aaa");
    }
}
