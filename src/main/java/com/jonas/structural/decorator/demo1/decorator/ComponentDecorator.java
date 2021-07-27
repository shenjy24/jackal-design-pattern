package com.jonas.structural.decorator.demo1.decorator;

import com.jonas.structural.decorator.demo1.component.Component;

/**
 * <p>
 * 构件装饰类：抽象装饰类
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-26
 */
public class ComponentDecorator extends Component {

    private Component component;  //维持对抽象构件类型对象的引用

    public ComponentDecorator(Component component) { //注入抽象构件类型的对象
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
