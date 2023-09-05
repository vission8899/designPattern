package com.vission.structural.decorator.service.impl;

import com.vission.structural.decorator.service.CoffeeService;

public class CoffeeServiceImpl implements CoffeeService {
    @Override
    public void mackCoffee(){
        System.out.println("这是一杯普通咖啡");
    }
}
