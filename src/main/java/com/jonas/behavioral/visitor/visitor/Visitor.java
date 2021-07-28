package com.jonas.behavioral.visitor.visitor;

import com.jonas.behavioral.visitor.element.Student;
import com.jonas.behavioral.visitor.element.Teacher;

/**
 * 抽象访问者，为该对象结构中具体元素角色声明一个访问操作接口。
 */
public interface Visitor {
    void visit(Student element);

    void visit(Teacher element);
}
