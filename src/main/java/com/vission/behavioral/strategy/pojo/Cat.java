package com.vission.behavioral.strategy.pojo;

import lombok.Builder;

@Builder
public class Cat {

    private int weight;
    private int height;

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

}
