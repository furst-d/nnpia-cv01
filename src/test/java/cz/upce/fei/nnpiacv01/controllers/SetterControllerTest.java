package cz.upce.fei.nnpiacv01.controllers;

import cz.upce.fei.nnpiacv01.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SetterControllerTest {
    SetterController setterController;

    @BeforeEach
    void setUp() {
        setterController = new SetterController();
        setterController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        String greeting = setterController.sayHello();
        System.out.println(greeting);
        assertEquals("Hello, World!", greeting);
    }
}