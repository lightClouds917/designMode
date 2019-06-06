package com.java4all.proxy;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
public class TeacherServiceCglibProxy implements MethodInterceptor{
    private TeacherService teacherService;

    public TeacherServiceCglibProxy(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    /**
     * 返回目标类的代理对象
     * 几行操作分别是：
     * 1.创建增强器
     * 2.指定父类，即目标类
     * 3.设置回调函数，继承关系如下：UserServiceImplCglibProxy implements MethodInterceptor，
     *              MethodInterceptor extends Callback
     * 4.创建动态代理对象
     *
     * @return
     */
    public TeacherService cglibCreator(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TeacherService.class);
        enhancer.setCallback(this);
        return (TeacherService)enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
            throws Throwable {
        Object invoke = method.invoke(teacherService, objects);
        if(null != null){
            return invoke.toString() + "  增强后的结果";
        }
        return null;
    }
}
