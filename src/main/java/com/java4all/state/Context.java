package com.java4all.state;

/**
 * @author IT云清
 */
public class Context {

    private State state;
    private int value;

    public void execute(){
        state.handle(1);
    }

    public void changeState(){
        if(value == 0){
            this.setState(new StateA());
        }else if(value == 1){
            this.setState(new StateB());
        }
    }




    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
