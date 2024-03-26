package codoacodo.moviesapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

// HARDCODEADO, SIMULO BASE DE DATOS
    // @GetMapping ("/movie1")
    // public Movie getMovie(){
    //     return movieService.getMovie();
    // }
   // MODIFICO PARA BASE EN WORKBENCH
    @PostMapping("/add")
    public void addMovie(@RequestBody Movie movie){
        movieService.addMovie(movie);
    }

// HARDCODEADO, SIMULO BASE DE DATOS
    // @GetMapping("/find")
    // public Movie findMovie(){
    //     Long id = 2L;
    //     Movie movieFound = movieService.findMovieById(id);
    //     return movieFound;
    // }
    // MODIFICO PARA BASE EN WORKBENCH
    @GetMapping("/{id}")
    public Movie findMovie(@PathVariable Long id){
        return movieService.findMovieById(id);
    }

// HARDCODEADO, SIMULO BASE DE DATOS    
    // @DeleteMapping("/delete")
    // public void deleteMovie(){
    //     Long id = 1L;
    //     movieService.deleteMovieById(id);
    // }
   // MODIFICO PARA BASE EN WORKBENCH
   @DeleteMapping("/delete/{id}")
   public void deleteMovie(@PathVariable Long id){
       movieService.deleteMovieById(id);
   }


	/* public List<Movie> hello(){
		return MovieService.showMovie;
	}
    */

    @PutMapping("/update")
    public Movie updateMovie(@RequestBody Movie movie){
    return movieService.update(movie);
}

}
