package com.cognizant.movies.service;

import com.cognizant.movies.model.Movie;
import com.cognizant.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;

    public List<Movie> getAll(){
        return repository.findAll();
    }
}
