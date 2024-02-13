package cz.upce.fei.nnpiacv01.controllers;

import cz.upce.fei.nnpiacv01.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyDiGreetingTest {
    PropertyDiGreeting propertyDiGreeting;

    @BeforeEach
    void setUp() {
        propertyDiGreeting = new PropertyDiGreeting();
        propertyDiGreeting.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello() {
        String greeting = propertyDiGreeting.sayHello();
        System.out.println(greeting);
        assertEquals("Hello, World!", greeting);
    }
}