package com.example.sfgspringdi.controllers;

import com.example.sfgspringdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;
    //dont use Autowired annotation with Constructor

    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetingService()
    {
        return greetingService.sayHello();
    }
}
