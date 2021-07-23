package com.jonas.structural.bridge.demo1.abstraction;

import com.jonas.structural.bridge.demo1.Matrix;

/**
 * <p>
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-25
 */
public class BMPImage extends Image {
    @Override
    public void parseFile(String fileName) {
        //模拟解析BMP文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为BMP。");
    }
}
