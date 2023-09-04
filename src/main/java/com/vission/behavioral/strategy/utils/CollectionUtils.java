package com.vission.behavioral.strategy.utils;

import com.vission.behavioral.strategy.Comparable;
import com.vission.behavioral.strategy.sort.SortUtils;
import com.vission.behavioral.strategy.sort.comparableStartegy.Comparator;
/**
 * 排序封装工具 封装已有策略
 */
public class CollectionUtils {

    public static <T extends Comparable<T>> void sort(T[] arr) {
        Comparator<T> comparator = Comparable::compareTo;
        SortUtils.bubblingSort(arr, comparator);
//        为什么会相等？从这几个步骤发展来的
//        第一步 lambda实现
//        Comparator<T> comparator = (o1,o2) -> {
//            return o1.compareTo(o2);
//        };
//        第二部 省略return
//        Comparator<T> comparator = (o1,o2) -> o1.compareTo(o2);
//        第三步 直接转为引用
//        Comparator<T> comparator = Comparable::compareTo;
//        SortUtils.bubblingSort(arr, Comparable::compareTo);
    }
}
