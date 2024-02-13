package cz.upce.fei.nnpiacv01.controllers;

import cz.upce.fei.nnpiacv01.services.GreetingService;

public class SetDiGreeting {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello() {
        greetingService.sayGreeting();
    }
}
