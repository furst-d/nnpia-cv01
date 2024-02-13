package cz.upce.fei.nnpiacv01.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManualGreetingTest {

    @Test
    void sayHello() {
        ManualGreeting manualGreeting = new ManualGreeting();
        String greeting = manualGreeting.sayHello();
        System.out.println(greeting);
        assertEquals("Hello, World!", greeting);
    }
}