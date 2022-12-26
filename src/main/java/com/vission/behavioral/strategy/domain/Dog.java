package com.vission.behavioral.strategy.domain;

import com.vission.behavioral.strategy.Comparable;
import lombok.Builder;

@Builder
public class Dog implements Comparable<Dog>, java.lang.Comparable<Dog> {

    private int weight;
    private int height;

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
        return Integer.compare(weight, o.weight);
    }
}
