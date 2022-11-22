package com.raster.movieapi.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	
	@RequestMapping("/movies")
	public List<Movie> getAllMovies(){
		return movieService.getAllMovies();
	}
	
	@RequestMapping("/movies/{id}")
	public Movie getMovieById(@PathVariable String id) {
		return movieService.getMovieById(Integer.parseInt(id));
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/movies")
	public void addMovie(@RequestBody Movie movie) {
		movieService.addMovie(movie);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/movies/{id}")
	public void updateMovieById(@RequestBody Movie movie, @PathVariable String id) {
		movieService.updateMovieById(movie, Integer.parseInt(id));
	}
	

	
	@RequestMapping(method=RequestMethod.DELETE, value="/movies/{id}")
	public void deleteMovieById(@PathVariable String id) {
		movieService.deleteMovieById(Integer.parseInt(id));
	}
	

}
