package codoacodo.moviesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import codoacodo.moviesapi.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
