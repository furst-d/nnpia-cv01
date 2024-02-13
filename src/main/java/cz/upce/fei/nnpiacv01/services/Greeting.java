package cz.upce.fei.nnpiacv01.services;

import org.springframework.stereotype.Service;

@Service
public class Greeting implements GreetingService {
    @Override
    public void sayGreeting() {
        System.out.println("Hello, World!");
    }
}
