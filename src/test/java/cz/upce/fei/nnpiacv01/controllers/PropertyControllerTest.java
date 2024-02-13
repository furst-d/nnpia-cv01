package cz.upce.fei.nnpiacv01.controllers;

import cz.upce.fei.nnpiacv01.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PropertyControllerTest {

    @Autowired
    PropertyController propertyController;

    @Test
    void sayHello() {
        String greeting = propertyController.sayHello();
        System.out.println(greeting);
        assertEquals("Hello, World!", greeting);
    }
}