package com.rllerena.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController       (value = "api")
public class MtnCategoria {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}