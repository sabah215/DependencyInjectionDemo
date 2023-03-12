package com.futurex.spring.DependencyInjectionDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
// It tells Spring that it's a Bean, and it needs to be managed by Spring
@Component
public class AnimalSpeaks {

    // It tells Spring what beans need to be injected during runtime
    @Autowired
    private Animal animal;


    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void makeAnimalSound(){
        animal.makeSound();
    }
}
