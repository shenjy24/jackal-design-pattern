package com.jonas.structural.proxy.dynamic_proxy;


import java.lang.reflect.Proxy;

/**
 * 动态代理对象
 */
public class UserProxyFactory {
    // 维护一个目标对象
    private Object target;

    public UserProxyFactory(Object target) {
        this.target = target;
    }

    // 为目标对象生成代理对象
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("开启事务");

                    // 执行目标对象方法
                    Object returnValue = method.invoke(target, args);

                    System.out.println("提交事务");
                    return null;
                });
    }
}
