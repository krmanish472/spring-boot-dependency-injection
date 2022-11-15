package com.techxtor.iocdilearning.autowiringtypes.autowiredonconstructor;

import com.techxtor.iocdilearning.autowiringtypes.FooFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// creates bean name "fooServiceConstructor"
@Component("fooServiceConstructor")
public class FooService {
    private FooFormatter fooFormatter;
    @Autowired
    public FooService(FooFormatter fooFormatter) {
        this.fooFormatter = fooFormatter;
    }
}
