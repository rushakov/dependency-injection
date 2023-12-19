package org.example.dependencyinjection;

import org.example.dependencyinjection.controllers.*;
import org.example.dependencyinjection.services.PetService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
        System.out.println("Pet------------------------------------------------");
        PetController petController = (PetController) context.getBean("petController");
        System.out.println(petController.getPetType());
        System.out.println("Profile--------------------------------------------");
        I18nInjectedController i18nInjectedController = (I18nInjectedController) context.getBean("i18nInjectedController");
        System.out.println(i18nInjectedController.getGreeting());
        System.out.println("PrimaryInjectedController------------------------- ");
        PrimaryInjectedController primaryInjectedController = (PrimaryInjectedController) context.getBean("primaryInjectedController");
        System.out.println(primaryInjectedController.getGreeting());
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
