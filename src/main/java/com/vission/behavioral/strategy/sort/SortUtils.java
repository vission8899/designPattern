package com.vission.behavioral.strategy.sort;

import com.vission.behavioral.strategy.sort.comparableStartegy.Comparator;

/**
 * 排序工具类
 *
 * @author vission
 */
public class SortUtils {

    /**
     * 冒泡排序
     */
    public static <T> void bubblingSort(T[] objects, Comparator<T> comparable) {
        for (int i = 0; i < objects.length - 1; i++) {
            for (int j = 0; j < objects.length - 1 - i; j++) {
                if (comparable.compare(objects[j], objects[j + 1]) > 0) {
                    swap(objects, j, j + 1);
                }
            }
        }
    }

    /**
     * 交换数组中两个元素的位置*
     *
     * @param objects 数组
     * @param m       位置1
     * @param n       位置2
     */
    private static <T> void swap(T[] objects, int m, int n) {
        T temp = objects[m];
        objects[m] = objects[n];
        objects[n] = temp;
    }

}
