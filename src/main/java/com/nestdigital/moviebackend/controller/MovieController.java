package com.nestdigital.moviebackend.controller;

import com.nestdigital.moviebackend.dao.MovieDao;
import com.nestdigital.moviebackend.model.MovieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    private int value;

    @Autowired
    private MovieDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/movieAdd",consumes = "application/json",produces = "application/json")
    public String movie(@RequestBody MovieModel movie){
        dao.save(movie);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewMovies")
    public List<MovieModel> viewMovie(){

        return (List<MovieModel>)dao.findAll();
    }
}
