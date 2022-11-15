package com.techxtor.iocdilearning.autowiringtypes.autowiredonsetters;

import com.techxtor.iocdilearning.autowiringtypes.FooFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// creates bean name "fooServiceSetter"
@Component("fooServiceSetter")
public class FooService {
    private FooFormatter fooFormatter;
    @Autowired
    public void setFormatter(FooFormatter fooFormatter) {
        this.fooFormatter = fooFormatter;
    }
}
