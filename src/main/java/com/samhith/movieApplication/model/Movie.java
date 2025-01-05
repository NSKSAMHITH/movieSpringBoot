package com.samhith.movieApplication.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Movie {

    private String name;
    private int id;
    private String genre;
    private String director;
    private float duration;
    private float imdbRating;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getDirector(){
        return director;
    }

    public void setDirector(String director){
        this.director = director;
    }

    public float getDuration(){
        return duration;
    }

    public float getImdbRating(){
        return imdbRating;
    }

    public void setDuration(float duration){
        this.duration = duration;
    }

    public void setImdbRating(float imdbRating){
        this.imdbRating = imdbRating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", duration=" + duration +
                ", imdbRating=" + imdbRating +
                '}';
    }
}
