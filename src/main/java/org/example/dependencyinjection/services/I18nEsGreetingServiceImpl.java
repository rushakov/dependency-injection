package org.example.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES","default"})
@Service("I18nGreetingService")
public class I18nEsGreetingServiceImpl implements GreetingService {
    @Override
    public String getGreeting() {
        return "hey - ES";
    }
}
