package com.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    Service1 service1;
    
    @GetMapping("/")
    public void index() {
        service1.doSomething();
    }
    
}
