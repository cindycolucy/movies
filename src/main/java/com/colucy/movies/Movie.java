package com.colucy.movies;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
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

	@ManyToMany
	private Set<Tag> tags;

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

	public Set<Tag> getTags() {
		return tags;
	}

	public Boolean hasImageUrl() {
		return imageUrl != null;
	}

	private Movie() {

	}

	public Movie(Genre genre, String title, String description, String review, String imageUrl, Tag... tags) {
		this.genre = genre;
		this.title = title;
		this.description = description;
		this.review = review;
		this.imageUrl = imageUrl;
		this.tags = new HashSet<>(Arrays.asList(tags));

	}

	public void remove(Tag toDelete) {
		tags.remove(toDelete);
		
	}

}
