package com.jonas.structural.adapter.demo1.adaptee;

/**
 * 快速排序类：适配者
 *
 * @author shenjy 2019/01/01
 */
public class QuickSort {

    public void quickSort(int[] numbers, int start, int end) {
        if (start < end) {
            //选定的基准值
            int base = numbers[start];
            int i = start, j = end;
            do {
                while ((numbers[i] < base) && (i < end)) {
                    i++;
                }
                while ((numbers[j] > base) && (j > start)) {
                    j--;
                }
                if (i <= j) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    i++;
                    j--;
                }
            } while (i <= j);
            if (start < j) {
                quickSort(numbers, start, j);
            }
            if (end > i) {
                quickSort(numbers, i, end);
            }
        }
    }
}
