package com.vission.behavioral.strategy;

public interface Comparable<T> {

    /**
     * 比较两个对象的大小
     *
     * @param o1 对象1
     * @return 大于1 等于0 小于-1
     */
    int compareTo(T o1);
}