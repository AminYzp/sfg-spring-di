package com.example.sfgspringdi.services;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World --- ConstructorGreetingServiceImpl";
    }
}
