package org.example.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("I18nGreetingService")
public class I18nEnGreetingServiceImpl implements GreetingService {
    @Override
    public String getGreeting() {
        return "hey - EN";
    }
}
