package com.jonas.behavioral.observer.listener;

import java.io.File;

/**
 * 具体订阅者：收到通知后在日志中记录一条消息
 */
public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
