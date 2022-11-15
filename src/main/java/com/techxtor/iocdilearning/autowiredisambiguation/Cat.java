package com.techxtor.iocdilearning.autowiredisambiguation;

import org.springframework.stereotype.Component;

// creates bean name "cat"
@Component
//@Component("cat")
public class Cat implements Animal {

    @Override
    public String sound() {
        return "meow";
    }
}
