package com.jonas.behavioral.visitor.element;

import com.jonas.behavioral.visitor.visitor.Visitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 具体元素，允许visitor访问本对象的数据结构。
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Element {
    private String name; // 学生姓名
    private int grade; // 成绩
    private int paperCount; // 论文数

    // visitor访问本对象的数据结构
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
