package com.jonas.structural.adapter.demo1;

import com.jonas.structural.adapter.demo1.adapter.ScoreOperation;
import com.jonas.util.XMLUtils;

/**
 * 客户端
 *
 * @author shenjy 2019/01/01
 */
public class Client {
    public static void main(String[] args) {
        ScoreOperation operation = (ScoreOperation) XMLUtils.getBean();
        int[] scores = {84, 76, 50, 69, 90, 91, 88, 96};

        System.out.println("成绩排序结果：");
        operation.sort(scores);
        for (int score : scores) {
            System.out.print(score + ",");
        }
        System.out.println();

        System.out.println("查找成绩90：");
        int score = operation.search(scores, 90);
        if (-1 != score) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
