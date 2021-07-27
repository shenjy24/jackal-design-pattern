package com.jonas.structural.decorator.demo1.component;

import com.jonas.structural.decorator.demo1.component.Component;

/**
 * <p>
 * 文本框类：具体构件类
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-26
 */
public class TextBox extends Component {
    @Override
    public void display() {
        System.out.println("显示文本框！");
    }
}
