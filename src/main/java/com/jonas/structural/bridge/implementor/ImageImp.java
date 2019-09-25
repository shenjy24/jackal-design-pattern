package com.jonas.structural.bridge.implementor;

import com.jonas.structural.bridge.Matrix;

/**
 * <p>
 * 抽象操作系统实现类：实现类接口
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-25
 */
public interface ImageImp {
    /**
     * 显示像素矩阵m
     * @param m
     */
    void doPaint(Matrix m);
}
