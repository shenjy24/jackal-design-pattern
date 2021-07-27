package com.jonas.structural.decorator.demo1.decorator;

import com.jonas.structural.decorator.demo1.component.Component;

/**
 * <p>
 * 滚动条装饰类：具体装饰类
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-26
 */
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        setScrollBar();
    }

    //新增业务方法
    public  void setScrollBar() {
        System.out.println("为构件增加滚动条！");
    }
}
