package com.jonas.structural.decorator.demo1.component;

import com.jonas.structural.decorator.demo1.component.Component;

/**
 * <p>
 * 窗体类：具体构件类
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-26
 */
public class Window extends Component {
    @Override
    public void display() {
        System.out.println("显示窗体！");
    }
}
