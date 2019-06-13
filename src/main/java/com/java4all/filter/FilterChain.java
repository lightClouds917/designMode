package com.java4all.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
public class FilterChain {

    private List<Filter> filters = new ArrayList<>();

    private Target target ;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        filters.stream().forEach(filter -> filter.execute(request));
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
