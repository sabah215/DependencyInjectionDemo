package com.futurex.spring.DependencyInjectionDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionDemoApplication.class, args);
		System.out.println("Dependency Injection Demo");
		//AnimalSpeaks obj1 = new AnimalSpeaks();
		// Animal animal = new Cat();
		AnimalSpeaks xyz = applicationContext.getBean(AnimalSpeaks.class);
		Animal animal = applicationContext.getBean(Animal.class);

		xyz.setAnimal(animal);
		xyz.makeAnimalSound();
		System.out.println("*****************************");
	}

}
