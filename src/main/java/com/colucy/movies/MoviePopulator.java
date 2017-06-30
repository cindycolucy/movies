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
		
		Movie savingPrivateRyan = new Movie(drama, "Saving Private Ryan (1998)", "Following the Normandy Landings, a group of U.S. soldiers go behind enemy lines to retrieve a paratrooper whose brothers have been killed in action.", "A touching tale of war and redemption. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.", "/images/privateryan.jpg");
		Movie theLegoMovie = new Movie(comedy, "The Lego Movie (2014)", "An ordinary Lego construction worker, thought to be the prophesied 'Special', is recruited to join a quest to stop an evil tyrant from gluing the Lego universe into eternal stasis.", "Great family entertainment. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.", "/images/lego.jpg");
		Movie batman = new Movie(adventure, "Batman (1989)", "The Dark Knight of Gotham City begins his war on crime with his first major enemy being the clownishly homicidal Joker.", "Action-packed bat adventure. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.", "/images/batman.jpg");
		Movie theMartian = new Movie(drama, "The Martian (2015)", "An astronaut becomes stranded on Mars after his team assume him dead, and must rely on his ingenuity to find a way to signal to Earth that he is alive.", "Thoughtful and entertaining. Charlie's favorite movie. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.", "/images/martian.jpg");
		Movie prideAndPrejudice = new Movie(drama, "Pride and Prejudice (2005)", "Sparks fly when spirited Elizabeth Bennet meets single, rich, and proud Mr. Darcy. But Mr. Darcy reluctantly finds himself falling in love with a woman beneath his class.", "Romantic period drama. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra metus sit amet lobortis ullamcorper. Suspendisse id mauris maximus, eleifend massa eget, tempor urna. Nam eget mollis dui, vel malesuada felis. Maecenas metus arcu, viverra et tincidunt ac, ullamcorper id sem. Sed turpis turpis, lobortis sed arcu egestas, fringilla ultrices lectus. Donec vel consequat nulla. Pellentesque ornare leo tortor, vel sodales urna pretium ac. Aliquam lacinia augue tellus, sit amet pulvinar risus hendrerit mattis.", "/images/pride.jpg");
		Movie pulpFiction = new Movie(drama, "Pulp Fiction (1994)", "The lives of two mob hit men, a boxer, a gangster's wife, and a pair of diner bandits intertwine in four tales of violence and redemption.", "A twisty tale. Lorem ipsum dolor sit amet, consectetur adipiscing elit. In neque sem, iaculis at augue vitae, pretium rutrum leo. Duis ornare dui et massa mollis tristique. Vivamus vulputate tortor eget ligula pulvinar, sit amet hendrerit ligula sagittis. In et sem ut elit laoreet aliquam. Vivamus sagittis dapibus eros, et luctus orci mattis venenatis. Donec in justo non enim ultrices pharetra. Donec tincidunt vitae justo non sodales. Curabitur lobortis vitae sem non elementum. Praesent mollis justo et erat fermentum aliquet. Aenean fringilla mauris eget augue tempor scelerisque. Aenean auctor commodo enim. Cras id tortor sed nulla ornare sollicitudin.", "/images/pulp.jpg");
		
		movieRepo.save(savingPrivateRyan);
		movieRepo.save(theLegoMovie);
		movieRepo.save(batman);
		movieRepo.save(theMartian);
		movieRepo.save(prideAndPrejudice);
		movieRepo.save(pulpFiction);
		
	}
	

}
