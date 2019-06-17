package com.java4all.filter;

/**
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
public class FilterManager {

    FilterChain filterChain;

    public FilterManager(Target target) {
        this.filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }

}
