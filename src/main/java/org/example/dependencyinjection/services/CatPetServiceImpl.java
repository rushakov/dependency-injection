package org.example.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Cat")
@Service
public class CatPetServiceImpl implements PetService{
    @Override
    public String getPetType() {
        return "Cat";
    }
}
