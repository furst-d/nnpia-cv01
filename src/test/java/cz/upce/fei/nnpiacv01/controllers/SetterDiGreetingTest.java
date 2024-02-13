package cz.upce.fei.nnpiacv01.controllers;

import cz.upce.fei.nnpiacv01.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SetterDiGreetingTest {
    SetterDiGreeting setDiGreeting;

    @BeforeEach
    void setUp() {
        setDiGreeting = new SetterDiGreeting();
        setDiGreeting.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        String greeting = setDiGreeting.sayHello();
        System.out.println(greeting);
        assertEquals("Hello, World!", greeting);
    }
}