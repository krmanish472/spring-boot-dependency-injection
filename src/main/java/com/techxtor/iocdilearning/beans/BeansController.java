package com.techxtor.iocdilearning.beans;

import com.techxtor.iocdilearning.beans.model.ExternalAPISource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BeansController {

/*
    @Autowired
    @Qualifier("localhostContract")
    private ExternalAPISource externalAPISource;*/

/*
    @Autowired
    private ExternalAPISource localhostContract;*/

    @Resource(name = "localhostContract")
    private ExternalAPISource externalAPISource;

    @GetMapping
    public String getBeans() {
        var clientContract = externalAPISource;
        return "success";
    }

}
// NOTE: We can make use of @Primary annotation as well on Method that needs to be resolved in case of ambiguity
