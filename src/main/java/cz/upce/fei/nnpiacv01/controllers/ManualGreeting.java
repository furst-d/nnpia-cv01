package cz.upce.fei.nnpiacv01.controllers;

import cz.upce.fei.nnpiacv01.services.GreetingServiceImpl;
import cz.upce.fei.nnpiacv01.services.GreetingService;

public class ManualGreeting {
    private final GreetingService greetingService;
    public ManualGreeting() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
