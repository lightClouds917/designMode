package com.java4all.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import lombok.extern.slf4j.Slf4j;

/**
 * jdk动态代理
 * 不需要代理类，由Proxy.newProxyInstance生成一个代理对象，在调用方法时，在invoke方法中增强
 * @author IT云清
 * @date 2019年01月01日 11:11:11
 */
@Slf4j
public class UserServiceImplJdkProxy{


    /**
     * 需要增强某个方式，调用前直接增强
     * 这里以增强doFirst方法为例，调用doFirst前，先实现增强逻辑，然后调用doFirst方法
     * 如果想给doSecond方法做其他增强，调用doSecond前，先实现增强逻辑，然后调用doSecond即可
     * @param args
     */
    public static void main(String[]args){
        //目标类对象
        UserServiceImpl userService = new UserServiceImpl();
        //增强前 返回值：doFirst返回
        log.info(userService.doFirst());

        //实现增强逻辑
        UserService jdkProxyUserService =
                (UserService) Proxy.newProxyInstance(
                        //目标类的类加载器
                    userService.getClass().getClassLoader(),
                        //目标类实现的所有接口
                    userService.getClass().getInterfaces(),
                        // 匿名内部类
                    new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args)
                                throws Throwable {
                            Object invoke = method.invoke(userService, args);
                            if (null != invoke) {
                                return invoke.toString() + "  增强效果显示";
                            }
                            return null;
                        }
                });


        //增强后 返回值：doFirst返回  增强效果显示
        log.info(jdkProxyUserService.doFirst());
    }


}
