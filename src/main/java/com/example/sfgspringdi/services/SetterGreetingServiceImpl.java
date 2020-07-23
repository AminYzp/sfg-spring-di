package com.example.sfgspringdi.services;
import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World --- SetterGreetingServiceImpl";
    }
}
