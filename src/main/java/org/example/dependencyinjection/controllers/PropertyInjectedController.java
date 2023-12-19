package org.example.dependencyinjection.controllers;

import org.example.dependencyinjection.services.GreetingService;
import org.example.dependencyinjection.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    private GreetingService greetingService;

    public String getGreeting(){
        return greetingService.getGreeting();
    }

}
