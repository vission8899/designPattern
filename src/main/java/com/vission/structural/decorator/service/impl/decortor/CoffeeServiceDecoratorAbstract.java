package com.vission.structural.decorator.service.impl.decortor;

import com.vission.structural.decorator.service.CoffeeService;

public  abstract class CoffeeServiceDecoratorAbstract implements CoffeeService {

    CoffeeService coffeeService ;

    public CoffeeServiceDecoratorAbstract(CoffeeService coffeeService){
        setCoffeeService(coffeeService);

    }

    private void setCoffeeService(CoffeeService coffeeService){
            this.coffeeService = coffeeService;
    }

    @Override
    public void mackCoffee() {
        coffeeService.mackCoffee();
    }

}
