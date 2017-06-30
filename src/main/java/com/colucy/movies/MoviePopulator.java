package com.colucy.movies;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MoviePopulator implements CommandLineRunner {
	
	@Resource
	private MoviesRepository movieRepo;
	
	@Resource
	private GenreRepository genreRepo;

	@Override
	public void run(String... args) throws Exception {
		
		Genre drama = new Genre("Drama", "Serious tone or subject.");
		Genre comedy = new Genre("Comedy", "Light and amusing character.");
		Genre adventure = new Genre("Adventure", "Involving danger and unknown risks.");
		
		genreRepo.save(drama);
		genreRepo.save(comedy);
		genreRepo.save(adventure);
		
		Movie savingPrivateRyan = new Movie(drama, "Saving Private Ryan", "Following the Normandy Landings, a group of U.S. soldiers go behind enemy lines to retrieve a paratrooper whose brothers have been killed in action.");
		Movie theLegoMovie = new Movie(comedy, "The Lego Movie", "An ordinary Lego construction worker, thought to be the prophesied 'Special', is recruited to join a quest to stop an evil tyrant from gluing the Lego universe into eternal stasis.");
		Movie batman = new Movie(adventure, "Batman", "The Dark Knight of Gotham City begins his war on crime with his first major enemy being the clownishly homicidal Joker.");
		Movie theMartian = new Movie(drama, "The Martian", "An astronaut becomes stranded on Mars after his team assume him dead, and must rely on his ingenuity to find a way to signal to Earth that he is alive.");
		Movie prideAndPrejudice = new Movie(drama, "Pride and Prejudice", "Sparks fly when spirited Elizabeth Bennet meets single, rich, and proud Mr. Darcy. But Mr. Darcy reluctantly finds himself falling in love with a woman beneath his class.");
		Movie pulpFiction = new Movie(drama, "Pulp Fiction", "The lives of two mob hit men, a boxer, a gangster's wife, and a pair of diner bandits intertwine in four tales of violence and redemption");
		
		movieRepo.save(savingPrivateRyan);
		movieRepo.save(theLegoMovie);
		movieRepo.save(batman);
		movieRepo.save(theMartian);
		movieRepo.save(prideAndPrejudice);
		movieRepo.save(pulpFiction);
		
	}
	

}
