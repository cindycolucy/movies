package com.colucy.movies;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public Set<Movie> getMovies() {
		return movies;
	}

	@ManyToMany(mappedBy="tags")
	private Set<Movie> movies;

	public Tag(String name) {
		this.name = name;
	}

	private Tag() {

	}

}
