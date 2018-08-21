package com.sleuth.sleuthserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest")
public class Controller {

    public static Logger LOG = LoggerFactory.getLogger(Controller.class);

    @GetMapping(value = "/server")
    public String helloWorld(){

        LOG.info("Inside seerver code");
        return "Hello World !!!!";
    }
}
