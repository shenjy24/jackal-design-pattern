package com.jonas.structural.bridge.demo1.abstraction;

import com.jonas.structural.bridge.demo1.implementation.ImageImp;

/**
 * <p>
 * 抽象图像类：抽象类
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-25
 */
public abstract class Image {
    protected ImageImp imp;

    public void setImp(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
