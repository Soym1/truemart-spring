package com.truemart.truemartspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TrueMartSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(TrueMartSpringApplication.class, args);
    }

}
