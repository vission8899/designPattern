package com.vission.structural.decorator.service.impl.decortor;

import com.vission.structural.decorator.service.CoffeeService;

public class CoffeeServiceDecoratorAmericano extends CoffeeServiceDecoratorAbstract{

    public CoffeeServiceDecoratorAmericano(CoffeeService coffeeService) {
        super(coffeeService);
    }

    public void mackAmericano() {
        System.out.println("我是一杯美式咖啡");
    }
}
