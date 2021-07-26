package com.jonas.structural.flyweight.demo1;

import com.jonas.structural.flyweight.demo1.ConcreteFlyweight;
import com.jonas.structural.flyweight.demo1.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂角色
 */
public class FlyweightFactory {
    private final Map<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweights.get(key);
        if (flyweight != null) {
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        } else {
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
