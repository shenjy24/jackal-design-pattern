package com.jonas.behavioral.visitor.visitor;

import com.jonas.behavioral.visitor.element.Student;
import com.jonas.behavioral.visitor.element.Teacher;

/**
 * 具体访问者： 选拔优秀成绩者
 */
public class GradeSelection implements Visitor {

    private String awardWords = "[%s]的分数是%d，荣获了成绩优秀奖。";

    @Override
    public void visit(Student element) {
        // 如果学生考试成绩超过90，则入围成绩优秀奖。
        if (element.getGrade() >= 90) {
            System.out.println(String.format(awardWords, element.getName(), element.getGrade()));
        }
    }

    @Override
    public void visit(Teacher element) {
        // 如果老师反馈得分超过85，则入围成绩优秀奖。
        if (element.getScore() >= 85) {
            System.out.println(String.format(awardWords, element.getName(), element.getScore()));
        }
    }
}
