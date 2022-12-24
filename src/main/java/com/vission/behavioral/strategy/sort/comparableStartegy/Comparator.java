package com.vission.behavioral.strategy.sort.comparableStartegy;

public interface Comparator<T> {

    /**
     * 比较两个对象的大小
     *
     * @param o1 对象1
     * @param o2 对象2
     * @return 大于1 等于0 小于-1
     */
    int compare(T o1, T o2);
}
