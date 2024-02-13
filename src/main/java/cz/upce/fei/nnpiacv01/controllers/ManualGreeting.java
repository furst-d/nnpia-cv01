package cz.upce.fei.nnpiacv01.controllers;

import cz.upce.fei.nnpiacv01.services.Greeting;
import cz.upce.fei.nnpiacv01.services.GreetingService;

public class ManualGreeting {
    private final GreetingService greetingService;
    public ManualGreeting() {
        this.greetingService = new Greeting();
    }

    public void sayHello() {
        greetingService.sayGreeting();
    }
}
