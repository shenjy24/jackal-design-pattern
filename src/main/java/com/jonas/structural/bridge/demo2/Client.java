package com.jonas.structural.bridge.demo2;

import com.jonas.structural.bridge.demo2.abstraction.AdvancedRemote;
import com.jonas.structural.bridge.demo2.abstraction.BasicRemote;
import com.jonas.structural.bridge.demo2.implementation.Device;
import com.jonas.structural.bridge.demo2.implementation.Radio;
import com.jonas.structural.bridge.demo2.implementation.Tv;

public class Client {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
