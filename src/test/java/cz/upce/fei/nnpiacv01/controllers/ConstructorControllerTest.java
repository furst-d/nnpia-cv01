package cz.upce.fei.nnpiacv01.controllers;

import cz.upce.fei.nnpiacv01.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorControllerTest {
    ConstructorController constructorController;

    @BeforeEach
    void setUp() {
        constructorController = new ConstructorController(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        String greeting = constructorController.sayHello();
        System.out.println(greeting);
        assertEquals("Hello, World!", greeting);
    }
}