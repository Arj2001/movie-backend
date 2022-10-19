package com.nestdigital.moviebackend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @PostMapping("/movieAdd")
    public String movie(){
        return "text";
    }
}
