package com.raster.movieapi.movie;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MovieService {
	private List<Movie> movies = Arrays.asList(
				new Movie(1, "The Prestige", "Christopher Nolan", (float) 8.8),
				new Movie(2, "The Dark Knight Rises", "Christopher Nolan", (float) 8.7),
				new Movie(3, "Inception", "Christopher Nolan", (float) 7.8),
				new Movie(4, "Interstellar", "Christopher Nolan", (float) 8.0)
			);
	
	public List<Movie> getAllMovies(){
		return movies;
	}

	public Movie getMovieById(int id) {
		// TODO Auto-generated method stub
		return movies.stream().filter(m -> m.getId()==id).findFirst().get();
	}


	public void addMovie(Movie movie) {
		// TODO Auto-generated method stub
		movies.add(movie);
	}

	public void updateMovieById(Movie movie, int id) {
		// TODO Auto-generated method stub
		movies.forEach(m -> {
			if(m.getId() == id) {
				m = movie;
			}
		});
	}


	public void deleteMovieById(int id) {
		// TODO Auto-generated method stub
		movies.removeIf(m -> m.getId() == id);
	}


	
}
