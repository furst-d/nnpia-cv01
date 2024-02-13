package cz.upce.fei.nnpiacv01.controllers;

import cz.upce.fei.nnpiacv01.services.Greeting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiTest {
    @Test
    void testManualGreeting() {
        ManualGreeting manualGreeting = new ManualGreeting();
        manualGreeting.sayHello();
    }

    @Test
    void testSetDiGreeting() {
        SetDiGreeting setDiGreeting = new SetDiGreeting();
        setDiGreeting.setGreetingService(new Greeting());
        setDiGreeting.sayHello();
    }

    @Test
    void testConstructorDiGreeting() {
        ConstructorDiGreeting constructorDiGreeting = new ConstructorDiGreeting(new Greeting());
        constructorDiGreeting.sayHello();
    }

}