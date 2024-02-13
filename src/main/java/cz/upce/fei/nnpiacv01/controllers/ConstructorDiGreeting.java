package cz.upce.fei.nnpiacv01.controllers;

import cz.upce.fei.nnpiacv01.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorDiGreeting {
    private final GreetingService greetingService;

    @Autowired
    public ConstructorDiGreeting(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
