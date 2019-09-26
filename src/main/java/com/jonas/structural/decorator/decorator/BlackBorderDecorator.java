package com.jonas.structural.decorator.decorator;

import com.jonas.structural.decorator.component.Component;

/**
 * <p>
 * 黑色边框装饰类：具体装饰类
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-26
 */
public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        setBlackBorder();
    }

    public void setBlackBorder() {
        System.out.println("为构件增加黑色边框！");
    }
}
