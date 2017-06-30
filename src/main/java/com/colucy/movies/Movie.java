package com.colucy.movies;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Movie {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	private Genre genre;

	private String title; // Do I need this???

	private String imageUrl;

	public Genre getGenre() {
		return genre;
	}

	public String getTitle() {
		return title;
	}

	public String getImageURL() {
		return imageUrl;
	}

	public Boolean hasImageUrl() {
		return imageUrl != null;
	}

	private Movie() {

	}

	public Movie(Genre genre, String title, String imageUrl) {
		super();
		this.genre = genre;
		this.title = title;
		this.imageUrl = imageUrl;
	}

}
