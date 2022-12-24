package com.vission.behavioral.strategy.sort.comparableStartegy.impl;

import com.vission.behavioral.strategy.domain.Cat;
import com.vission.behavioral.strategy.sort.comparableStartegy.Comparator;

public class CatHeightStrategy implements Comparator<Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        return Integer.compare(cat1.getHeight(), cat2.getHeight());
    }
}
