package org.example.dependencyinjection.controllers;

import org.example.dependencyinjection.services.GreetingService;
import org.example.dependencyinjection.services.PropertyGreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyGreetingServiceImpl")
    @Autowired
    private GreetingService greetingService;

    public String getGreeting(){
        return greetingService.getGreeting();
    }

}
