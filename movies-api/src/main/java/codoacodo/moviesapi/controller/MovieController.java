package codoacodo.moviesapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import codoacodo.moviesapi.model.Movie;
import codoacodo.moviesapi.services.MovieService;


@RestController
@RequestMapping("/movies")

public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }

    @GetMapping ("/getMovie")
    public Movie chooseMovie(){
        return movieService.chooseMovie();
    }

    // @GetMapping ("/movie1")
    // public Movie getMovie(){
    //     return movieService.getMovie();
    // }

    @PostMapping("/add")
    public void addMovie(){
        movieService.addMovie();
    }

    @GetMapping("/find")
    public Movie findMovie(){
        Long id = 2L;
        Movie movieFound = movieService.findMovieById(id);
        return movieFound;
    }

    @DeleteMapping("/delete")
    public void deleteMovie(){
        Long id = 1L;
        movieService.deleteMovieById(id);
    }



	/* public List<Movie> hello(){
		return MovieService.showMovie;
	}
    */

}
