package cz.upce.fei.nnpiacv01.controllers;

import cz.upce.fei.nnpiacv01.services.GreetingService;

public class PropertyDiGreeting {
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
