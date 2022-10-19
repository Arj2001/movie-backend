package com.nestdigital.moviebackend.controller;

import com.nestdigital.moviebackend.dao.MovieDao;
import com.nestdigital.moviebackend.model.MovieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private MovieDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/movieAdd",consumes = "application/json",produces = "application/json")
    public String movie(@RequestBody MovieModel movie){
        dao.save(movie);
        return "{status:'success'}";
    }
}
