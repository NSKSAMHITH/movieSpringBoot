package com.samhith.movieApplication;

import com.samhith.movieApplication.model.Movie;
import com.samhith.movieApplication.service.MovieService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class MovieApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MovieApplication.class, args);

		Movie m = context.getBean(Movie.class);
		m.setDirector("heera");

		MovieService service = context.getBean(MovieService.class);
		//service.getMovies();

		List<Movie> movies = service.getMovies();
		System.out.println(movies);

	}

}
