package com.vission.behavioral.strategy.utils;

import com.vission.behavioral.strategy.Comparable;
import com.vission.behavioral.strategy.sort.SortUtils;

public class CollectionUtils {

    public static <T extends Comparable<T>> void sort(T[] arr) {
        SortUtils.bubblingSort(arr, Comparable::compareTo);
    }
}
