package cz.upce.fei.nnpiacv01.controllers;

import cz.upce.fei.nnpiacv01.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorDiGreetingTest {
    ConstructorDiGreeting constructorDiGreeting;

    @BeforeEach
    void setUp() {
        constructorDiGreeting = new ConstructorDiGreeting(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        String greeting = constructorDiGreeting.sayHello();
        System.out.println(greeting);
        assertEquals("Hello, World!", greeting);
    }
}