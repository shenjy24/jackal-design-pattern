package com.jonas.structural.proxy.cglib_proxy;

/**
 * 目标对象:无需实现接口
 */
public class UserDao {
    public void save() {
        System.out.println("保存数据");
    }
}
