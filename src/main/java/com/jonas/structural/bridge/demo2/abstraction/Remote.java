package com.jonas.structural.bridge.demo2.abstraction;

/**
 * 所有远程控制器的通用接口
 */
public interface Remote {

    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}
