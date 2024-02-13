package cz.upce.fei.nnpiacv01.services;

public class Greeting implements GreetingService {
    @Override
    public void sayGreeting() {
        System.out.println("Hello, World!");
    }
}
