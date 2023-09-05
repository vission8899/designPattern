package com.vission.structural.decorator.service.impl.proxy;

import com.vission.structural.decorator.service.CoffeeService;
import com.vission.structural.decorator.service.impl.CoffeeServiceImpl;

public class CoffeeServiceProxy implements CoffeeService {

    CoffeeService coffeeService = new CoffeeServiceImpl();

    @Override
    public void mackCoffee() {
        System.out.println("增强");
        coffeeService.mackCoffee();
        System.out.println("增强");
    }
}
