package com.colucy.movies;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre {

	@Id
	@GeneratedValue
	public Long id;


	private String name;
	private String description;

	@OneToMany(mappedBy = "genre")
	private Set<Movie> movies;

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Set<Movie> getMovies() {
		return movies;
	}
	
	public Genre(String name, String description) {
		this.name = name;
		this.description = description;
	}

	private Genre() {

	}
	@Override
	public String toString() {
		return name;
	}

}
