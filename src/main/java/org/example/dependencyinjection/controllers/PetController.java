package org.example.dependencyinjection.controllers;

import org.example.dependencyinjection.services.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
    PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String getPetType(){
        return petService.getPetType();
    }
}
