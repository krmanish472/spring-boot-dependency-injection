package com.techxtor.iocdilearning.autowiringtypes;

import org.springframework.stereotype.Component;

// creates bean name "fooFormatter"
@Component("fooFormatter")
public class FooFormatter {
    public String format() {
        return "foo";
    }
}
