package cz.upce.fei.nnpiacv01.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyControllerTest {

    @Test
    void sayHello() {
        MyController myController = new MyController();
        String greeting = myController.sayHello();
        System.out.println(greeting);
        assertEquals("Hello, World!", greeting);
    }
}