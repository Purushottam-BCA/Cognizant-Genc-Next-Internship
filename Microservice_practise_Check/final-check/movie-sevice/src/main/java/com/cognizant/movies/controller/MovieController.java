package com.cognizant.movies.controller;

import com.cognizant.movies.model.Movie;
import com.cognizant.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;
    @GetMapping(path = "/movies")
    public List<Movie> getMovies(){
        return movieService.getAll();
    }
}
