package codoacodo.moviesapi.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


import codoacodo.moviesapi.model.Movie;

@Service

public class MovieService {

    // private List<Movie> movieList = Arrays.asList(

    //     new Movie (1L, "Nope", 3, LocalDateTime.of(2024, 3, 9, 18, 0), LocalDateTime.of(2024, 3, 9, 20, 0), 2000),

    //     new Movie (2L, "The Godfather", 4, LocalDateTime.of(2024, 3, 9, 18, 0), LocalDateTime.of(2024, 3, 9, 20, 0), 2000),

    //     new Movie (3L, "Poor things", 5, LocalDateTime.of(2024, 3, 9, 18, 0), LocalDateTime.of(2024, 3, 9, 20, 0), 2000)

    // );

    private List<Movie> movieList = new ArrayList<>(Arrays.asList(
        new Movie(1L, "Nope", 3, LocalDateTime.of(2024, 3, 9, 18, 0), LocalDateTime.of(2024, 3, 9, 20, 0), 2000),
        new Movie(2L, "The Godfather", 4, LocalDateTime.of(2024, 3, 9, 18, 0), LocalDateTime.of(2024, 3, 9, 20, 0), 2000),
        new Movie(3L, "Poor things", 5, LocalDateTime.of(2024, 3, 9, 18, 0), LocalDateTime.of(2024, 3, 9, 20, 0), 2000)
    ));


    public List<Movie> getAllMovies(){
        return movieList;
    }

    public Movie chooseMovie(){
        return movieList.get(1);
    }
    
    // public Movie getMovie(){
    //     return new Movie(1L, "Nope", 3, LocalDateTime.of(2024, 3, 9, 18, 0), LocalDateTime.of(2024, 3, 9, 20, 0), 2000);
    // }

    public void addMovie(){
        movieList.add(new Movie(4L, "Taxi Driver", 2, LocalDateTime.of(2024, 3, 9, 18, 0), LocalDateTime.of(2024, 3, 9, 20, 0), 2000));
    }

    public Movie findMovieById(Long id) {
        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).getId() == id){
                return movieList.get(i);
            }
        }
        return null;
    }


    public void deleteMovieById(Long id) {
        Movie movieToDelete = findMovieById(id);
        movieList.remove(movieToDelete);
    }

}
