package com.techxtor.iocdilearning.optionaldependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// creates bean name "fooServiceOptional"
@Component("fooServiceOptional")
public class FooService {
    // When a bean is being constructed, the @Autowired dependencies should be available.
    // Otherwise, if Spring cannot resolve a bean for wiring, it will throw an exception.
    // To fix this, we need to declare a bean of the required type false
    @Autowired(required = false)
    private FooDAO dataAccessor;
}
