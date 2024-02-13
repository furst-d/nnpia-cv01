package cz.upce.fei.nnpiacv01.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConstructorControllerTest {

    @Autowired
    ConstructorController constructorController;

    @Test
    void sayHello() {
        String greeting = constructorController.sayHello();
        System.out.println(greeting);
        assertEquals("Hello, World!", greeting);
    }
}