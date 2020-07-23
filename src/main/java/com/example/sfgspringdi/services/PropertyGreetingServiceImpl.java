package com.example.sfgspringdi.services;
import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World --- PropertyGreetingServiceImpl";
    }
}
