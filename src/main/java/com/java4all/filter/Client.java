package com.java4all.filter;

/**
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
public class Client {

    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }

}
