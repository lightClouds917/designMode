package com.java4all.eventbus;

/**
 * @author IT云清
 */
public class Java4allEvent {
    private final String message;

    public Java4allEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}