package com.vission.structural.decorator.service.impl.decortor;

import com.vission.structural.decorator.service.CoffeeService;

public class CoffeeServiceDecoratorHandmade extends CoffeeServiceDecoratorAbstract{

    public CoffeeServiceDecoratorHandmade(CoffeeService coffeeService) {
        super(coffeeService);
    }

    @Override
    public void mackCoffee() {
        super.mackCoffee();
    }

    public void mackHandmade() {
        System.out.println("我是一杯美式咖啡");
    }
}
