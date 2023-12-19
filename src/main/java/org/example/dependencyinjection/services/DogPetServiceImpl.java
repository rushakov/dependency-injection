package org.example.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"Dog","default"})
@Service
public class DogPetServiceImpl implements PetService{
    @Override
    public String getPetType() {
        return "Dog";
    }
}
