package com.vission.structural.adapter.domain.impl;

import com.vission.structural.adapter.domain.Duck;

/**
 * 唐老鸭
 */
public class DonaldDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("唐老鸭叫");
    }

    @Override
    public void fly() {
        System.out.println("唐老鸭飞");
    }

}
