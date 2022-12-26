package com.vission.structural.adapter;

import com.vission.structural.adapter.domain.Chicken;
import com.vission.structural.adapter.domain.Duck;

public class DuckAdapter implements Chicken {

    private Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }


    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }

}
