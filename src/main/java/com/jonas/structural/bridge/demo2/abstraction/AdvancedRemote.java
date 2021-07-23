package com.jonas.structural.bridge.demo2.abstraction;

import com.jonas.structural.bridge.demo2.implementation.Device;

/**
 * 高级远程控制器
 */
public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
