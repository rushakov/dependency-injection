package org.example.dependencyinjection.controllers;

import org.example.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryInjectedController {
    GreetingService greetingService;

    public PrimaryInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.getGreeting();
    }
}
