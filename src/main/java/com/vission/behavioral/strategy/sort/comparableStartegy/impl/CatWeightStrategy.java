package com.vission.behavioral.strategy.sort.comparableStartegy.impl;

import com.vission.behavioral.strategy.pojo.Cat;
import com.vission.behavioral.strategy.sort.comparableStartegy.Comparator;

public class CatWeightStrategy implements Comparator<Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        return Integer.compare(cat1.getWeight(), cat2.getWeight());
    }
}
