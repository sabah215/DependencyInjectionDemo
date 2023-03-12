package com.futurex.spring.DependencyInjectionDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public interface Animal {

    void makeSound();
}
