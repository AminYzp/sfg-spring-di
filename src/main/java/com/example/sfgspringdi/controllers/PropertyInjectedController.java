package com.example.sfgspringdi.controllers;

import com.example.sfgspringdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyGreetingServiceImpl")
    @Autowired
    public GreetingService greetingService;
    public String getGreetingService()
    {
        return greetingService.sayHello();
    }
}
