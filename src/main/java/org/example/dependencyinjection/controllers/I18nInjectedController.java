package org.example.dependencyinjection.controllers;

import org.example.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nInjectedController {
    GreetingService greetingService;

    public I18nInjectedController(@Qualifier("I18nGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.getGreeting();
    }
}
