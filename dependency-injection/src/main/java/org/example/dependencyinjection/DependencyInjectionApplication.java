package org.example.dependencyinjection;

import org.example.dependencyinjection.controllers.ConstructorInjectedController;
import org.example.dependencyinjection.controllers.PropertyInjectedController;
import org.example.dependencyinjection.controllers.SetterInjectedController;
import org.example.dependencyinjection.services.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
        System.out.println("PropertyInjectedController-------------------------");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController)context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());
        System.out.println("SetterInjectedController---------------------------");
        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());
        System.out.println("ConstructorInjectedController----------------------");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
