package com.samhith.movieApplication.service;

import com.samhith.movieApplication.model.Movie;
import com.samhith.movieApplication.repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private MovieRepo repo;

    public MovieRepo getRepo(){
        return repo;
    }

    @Autowired
    public void setRepo(MovieRepo repo){
        this.repo = repo;
    }

//    public void addMovie(Movie m){
//        repo.save(m);
//    }

    public List<Movie> getMovies(){
        return repo.findAll();
    }

}
