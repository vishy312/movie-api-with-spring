package com.raster.movieapi.movie;

public class Movie {
	private int id;
	private String name;
	private String director;
	private float rating;
	
	public Movie(int id, String name, String director, float rating) {
		super();
		this.id = id;
		this.name = name;
		this.director = director;
		this.rating = rating;
	}
	
	public Movie() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", director=" + director + ", rating=" + rating + "]";
	}
	
	
}
