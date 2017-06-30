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
	private Long id;

	private String title;
	private String description;

	@OneToMany(mappedBy = "genre")
	private Set<Movie> movies;

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public Genre(String title, String description) {
		this.title = title;
		this.description = description;
	}

	private Genre() {

	}

}
