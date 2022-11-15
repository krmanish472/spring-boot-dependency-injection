package com.techxtor.iocdilearning.autowiredisambiguation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

// creates bean name "animalService"
@Service
public class AnimalService {
    // NOTE: Autowiring by Type ("Animal.class")
    // By default, Spring resolves @Autowired entries by type
    // there are 2 candidates of same type(Animal) : Cat, Dog
    // Resolution #1: Autowiring by @Qualifier
    // If there's more than one bean of the same type, we can use the @Qualifier annotation to reference a bean by name
    @Autowired
    @Qualifier("cat")
    private Animal animal;

    // Resolution #2: Autowiring by Name
    // By default, Spring resolves @Autowired entries by type, in case of ambiguity, it resolves entry by name
    // Spring uses the bean's name("cat") as a default qualifier value.
    // It will inspect the container and look for a bean with the exact name as the property("cat") to autowire it
    @Autowired
    private Animal cat;

    // NOTE: Autowiring by Name ("dog")
    @Autowired
    private Animal dog;


    // Resolution #3: @Resource(name = "<bean_name>")
    // @Resource means get me a known resource by name.
    // The name is extracted from the name of the annotated setter or field, or it is taken from the name-Parameter.
    @Resource(name = "dog")
    private Animal newAnimal;


    // Resolution #4: @Resource by Name
    // It will inspect the container and look for a bean with the exact name as the property("cat", "dog") to autowire it
    // commenting as we already have cat and dog as fields
/*
    @Resource
    private Animal cat;

    @Resource
    private Animal dog;
*/

}

// NOTE: We can make use of @Primary annotation as well on Class that needs to be resolved in case of ambiguity
// Error Sample:
// Consider marking one of the beans as @Primary,
// updating the consumer to accept multiple beans,
// or using @Qualifier to identify the bean that should be consumed

// POINT
// Autowired by Name >> Autowired by Type
