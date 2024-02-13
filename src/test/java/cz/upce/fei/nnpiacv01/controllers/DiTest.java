package cz.upce.fei.nnpiacv01.controllers;

import cz.upce.fei.nnpiacv01.services.Greeting;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DiTest {

    @Autowired
    private ConstructorDiGreeting constructorDiGreeting;

    @Autowired
    private SetDiGreeting setDiGreeting;

    @Test
    void testManualGreeting() {
        ManualGreeting manualGreeting = new ManualGreeting();
        manualGreeting.sayHello();
    }

    @Test
    void testSetDiGreeting() {
        setDiGreeting.sayHello();
    }

    @Test
    void testConstructorDiGreeting() {
        constructorDiGreeting.sayHello();
    }
}