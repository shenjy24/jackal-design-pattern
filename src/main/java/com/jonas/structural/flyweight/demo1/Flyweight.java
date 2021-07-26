package com.jonas.structural.flyweight.demo1;

/**
 * 抽象享元角色
 */
public interface Flyweight {
    //非享元的外部状态以参数的形式通过方法传入
    void operation(UnsharedConcreteFlyweight state);
}
