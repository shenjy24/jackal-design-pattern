package com.jonas.structural.flyweight.demo1;

/**
 * 非享元角色，里面包含了非共享的外部状态信息 info
 */
public class UnsharedConcreteFlyweight {
    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
