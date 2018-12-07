package com.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringBootLoggingApplication {

    public static void main(String[] args) {
       ApplicationContext  applicationContext = SpringApplication.run(SpringBootLoggingApplication.class, args);
    }
}
