package com.vission.structural.decorator;

import com.vission.structural.decorator.service.CoffeeService;
import com.vission.structural.decorator.service.impl.CoffeeServiceImpl;
import com.vission.structural.decorator.service.impl.decortor.CoffeeServiceDecoratorAmericano;
import com.vission.structural.decorator.service.impl.decortor.CoffeeServiceDecoratorHandmade;

public class Main {
    public static void main(String[] args) {
        CoffeeService coffeeService = new CoffeeServiceImpl();
        coffeeService.mackCoffee();
        CoffeeServiceDecoratorHandmade handmade = new CoffeeServiceDecoratorHandmade(coffeeService);
        handmade.mackHandmade();
        CoffeeServiceDecoratorAmericano americano = new CoffeeServiceDecoratorAmericano(handmade);
        americano.mackAmericano();

    }
}
