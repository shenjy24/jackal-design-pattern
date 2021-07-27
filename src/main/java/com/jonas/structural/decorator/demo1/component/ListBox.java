package com.jonas.structural.decorator.demo1.component;

/**
 * <p>
 * 列表框类：具体构件类
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-26
 */
public class ListBox extends Component {
    @Override
    public void display() {
        System.out.println("显示列表框！");
    }
}
