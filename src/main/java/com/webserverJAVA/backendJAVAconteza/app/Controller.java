package com.webserverJAVA.backendJAVAconteza.app;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping
    public Container createContainer(@RequestBody Container container){



    }

}
