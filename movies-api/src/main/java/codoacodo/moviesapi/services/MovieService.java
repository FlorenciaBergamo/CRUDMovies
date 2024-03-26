package codoacodo.moviesapi.services;

import java.time.LocalDateTime;
// import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import android.R.id;
import codoacodo.moviesapi.model.Movie;
import codoacodo.moviesapi.repository.MovieRepository;

@Service

public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    // private List<Movie> movieList = Arrays.asList(

    //     new Movie (1L, "Nope", 3, LocalDateTime.of(2024, 3, 9, 18, 0), LocalDateTime.of(2024, 3, 9, 20, 0), 2000),

    //     new Movie (2L, "The Godfather", 4, LocalDateTime.of(2024, 3, 9, 18, 0), LocalDateTime.of(2024, 3, 9, 20, 0), 2000),

    //     new Movie (3L, "Poor things", 5, LocalDateTime.of(2024, 3, 9, 18, 0), LocalDateTime.of(2024, 3, 9, 20, 0), 2000)

    // );


    // private List<Movie> movieList = new ArrayList<>(Arrays.asList(
    //     new Movie(1L, "Nope", 3, LocalDateTime.of(2024, 3, 9, 18, 0), LocalDateTime.of(2024, 3, 9, 20, 0), 2000),
    //     new Movie(2L, "The Godfather", 4, LocalDateTime.of(2024, 3, 9, 18, 0), LocalDateTime.of(2024, 3, 9, 20, 0), 2000),
    //     new Movie(3L, "Poor things", 5, LocalDateTime.of(2024, 3, 9, 18, 0), LocalDateTime.of(2024, 3, 9, 20, 0), 2000)
    // ));

// JSON:
// [
    // {
    //     "id": 1,
    //     "title": "Nope",
    //     "screen": 3,
    //     "dateTimeStarts": "2024-03-09T18:00:00",
    //     "dateTimeEnds": "2024-03-09T20:00:00",
    //     "price": 2000.0
    // },
//     {
        // "id": 2,
        // "title": "The Godfather",
        // "screen": 4,
        // "dateTimeStarts": "2024-03-09T18:00:00",
        // "dateTimeEnds": "2024-03-09T20:00:00",
        // "price": 2000.0
//     },
//     {
        // "id": 3,
        // "title": "Poor things",
        // "screen": 5,
        // "dateTimeStarts": "2024-03-09T18:00:00",
        // "dateTimeEnds": "2024-03-09T20:00:00",
        // "price": 2000.0
//     }
// ]


// HARDCODEADO SIMULO BASE
    // public List<Movie> getAllMovies(){
    //     // return movieList;
    //     return null;
    // }
// MODIFICO PARA BASE EN WORKBENCH
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public void addMovie(Movie movie){
        movieRepository.save(movie);
        // movieList.add(new Movie(4L, "Taxi Driver", 2, LocalDateTime.of(2024, 3, 9, 18, 0), LocalDateTime.of(2024, 3, 9, 20, 0), 2000));
    }

// HARDCODEADO SIMULO BASE
    // public Movie findMovieById(Long id) {
    //     // for (int i = 0; i < movieList.size(); i++) {
    //     //     if (movieList.get(i).getId() == id){
    //     //         return movieList.get(i);
    //     //     }
    //     // }
    //     return null;
    // }
   // MODIFICO PARA BASE EN WORKBENCH
    public Movie findMovieById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }

// HARDCODEADO SIMULO BASE
    // public void deleteMovieById(Long id) {
    //     // Movie movieToDelete = findMovieById(id);
    //     // movieList.remove(movieToDelete);
    // }
   // MODIFICO PARA BASE EN WORKBENCH
    public void deleteMovieById(Long id) {
    movieRepository.deleteById(id);
}

    public Movie update(Movie movie){
    movieRepository.save(movie);
    return movieRepository.findById(movie.getId()).orElse(null);
}

}
