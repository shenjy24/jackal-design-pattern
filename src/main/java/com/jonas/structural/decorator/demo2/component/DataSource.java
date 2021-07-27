package com.jonas.structural.decorator.demo2.component;

/**
 * 抽象构件：定义了读取和写入操作的通用数据接口
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
