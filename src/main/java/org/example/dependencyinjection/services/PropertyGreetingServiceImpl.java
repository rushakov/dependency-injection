package org.example.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String getGreeting() {
        return "hey - Property";
    }
}
