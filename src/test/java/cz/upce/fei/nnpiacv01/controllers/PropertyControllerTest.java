package cz.upce.fei.nnpiacv01.controllers;

import cz.upce.fei.nnpiacv01.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyControllerTest {
    PropertyController propertyController;

    @BeforeEach
    void setUp() {
        propertyController = new PropertyController();
        propertyController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello() {
        String greeting = propertyController.sayHello();
        System.out.println(greeting);
        assertEquals("Hello, World!", greeting);
    }
}