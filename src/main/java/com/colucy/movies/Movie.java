package com.colucy.movies;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Movie {

	@Id
	@GeneratedValue
	public Long id;

	@ManyToOne
	private Genre genre;

	private String title;

	@Lob
	private String description;

	@Lob
	private String review;

	private String imageUrl;

	private String tag;

	public Genre getGenre() {
		return genre;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getReview() {
		return review;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getTag() {
		return tag;
	}

	public Boolean hasImageUrl() {
		return imageUrl != null;
	}

	private Movie() {

	}

	public Movie(Genre genre, String title, String description, String review, String imageUrl, String tag) {
		this.genre = genre;
		this.title = title;
		this.description = description;
		this.review = review;
		this.imageUrl = imageUrl;
		this.tag = tag;

	}

}
