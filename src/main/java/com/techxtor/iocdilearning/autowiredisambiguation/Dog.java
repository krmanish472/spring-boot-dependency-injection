package com.techxtor.iocdilearning.autowiredisambiguation;

import org.springframework.stereotype.Component;

// creates bean name "dog"
@Component
//@Component("dog")
public class Dog implements Animal {

    @Override
    public String sound() {
        return "bark";
    }
}
