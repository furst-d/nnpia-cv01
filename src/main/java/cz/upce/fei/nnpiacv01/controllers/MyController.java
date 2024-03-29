package cz.upce.fei.nnpiacv01.controllers;

import cz.upce.fei.nnpiacv01.services.GreetingServiceImpl;
import cz.upce.fei.nnpiacv01.services.GreetingService;

public class MyController {
    private final GreetingService greetingService;
    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
