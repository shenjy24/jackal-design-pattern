package com.jonas.structural.adapter.demo1.adapter;

/**
 * ScoreOperation
 *
 * @author shenjy
 * @version 1.0
 * @date 2021-06-14
 */
public interface ScoreOperation {

    int[] sort(int[] array);

    int search(int[] array, int key);
}
