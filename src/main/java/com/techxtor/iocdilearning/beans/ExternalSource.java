package com.techxtor.iocdilearning.beans;

import com.techxtor.iocdilearning.beans.model.ExternalAPISource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// @Configuration annotation indicates that the class is a source of bean definitions
// @Component is also fine here though
// @Configuration Indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions
// and service requests for those beans at runtime
@Configuration
public class ExternalSource {

    // We use the @Bean annotation on a method to define a bean.
    // If we don't specify a custom name, then the bean name will default to the method name
    // creates a bean name "getApiContract"
    @Bean
    public ExternalAPISource getApiContract(){
        return new ExternalAPISource("https://example.com", "user-admin", "pass-admin");
    }

    // creates a bean name "getDefaultApiContract"
    @Bean
    public ExternalAPISource getDefaultApiContract(){
        return new ExternalAPISource();
    }

    // creates a bean name "localhostContract", as custom name is specified
    @Bean("localhostContract")
    public ExternalAPISource getLocalhost(){
        return new ExternalAPISource("https://localhost:3000", "some-name", "some-password");
    }
}
