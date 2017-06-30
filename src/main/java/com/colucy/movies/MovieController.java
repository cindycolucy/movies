package com.colucy.movies;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MovieController {
	
	@Resource
	private MoviesRepository movieRepo;
	
	@Resource
	private GenreRepository genreRepo;
	
	@RequestMapping("/genres")
	public String fetchGenre(Model model) {
		model.addAttribute("genres", genreRepo.findAll());
		return "genreList";
	}
	
	@RequestMapping("/genre")
	public String fetchGenre(@RequestParam("id") Long id, Model model) {
		model.addAttribute(genreRepo.findOne(id));
		return "genreDetail";
	}
	
	@RequestMapping("/movies")
	public String fetchMovies(Model model) {
		model.addAttribute("movies", movieRepo.findAll());
				return "moviesList";
	}
	
	@RequestMapping("/movie")
	public String fetchMovieDetail(@RequestParam("id") long id, Model model) {
		Movie selectedMovie = movieRepo.findOne(id);
		model.addAttribute(selectedMovie);
		return "movieDetail";
	}
	

}
