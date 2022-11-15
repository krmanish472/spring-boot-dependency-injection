package com.techxtor.iocdilearning.autowiringtypes.autowiredonproperty;

import com.techxtor.iocdilearning.autowiringtypes.FooFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// creates bean name "fooServiceProperty"
@Component("fooServiceProperty")
public class FooService {
    // inject "fooFormatter" bean into the FooService bean using @Autowired on the field definition
    // As a result, Spring injects fooFormatter when FooService is created
    @Autowired
    private FooFormatter fooFormatter;
}
