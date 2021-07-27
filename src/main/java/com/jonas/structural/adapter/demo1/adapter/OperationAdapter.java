package com.jonas.structural.adapter.demo1.adapter;

import com.jonas.structural.adapter.demo1.adaptee.BinarySearch;
import com.jonas.structural.adapter.demo1.adaptee.QuickSort;

/**
 * 操作适配器：适配器
 *
 * @author shenjy 2019/01/01
 */
public class OperationAdapter implements ScoreOperation {

    private QuickSort sortObj;

    private BinarySearch searchObj;

    public OperationAdapter() {
        sortObj = new QuickSort();
        searchObj = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        sortObj.quickSort(array, 0, array.length - 1);
        return array;
    }

    @Override
    public int search(int[] array, int key) {
        return searchObj.binarySearch(array, key);
    }
}
