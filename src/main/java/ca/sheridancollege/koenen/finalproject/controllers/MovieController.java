package ca.sheridancollege.koenen.finalproject.controllers;

import ca.sheridancollege.koenen.finalproject.entities.Movie;
import ca.sheridancollege.koenen.finalproject.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/movies")
public class MovieController {
    private final MovieRepository movieRepository;

    @GetMapping
    List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @GetMapping("/{id}")
    Movie getMovie(@PathVariable Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    @PostMapping("/add")
    Movie addMovie(@RequestBody Movie newMovie) {
        return movieRepository.save(newMovie);
    }

    @DeleteMapping("/{id}")
    boolean deleteMovie(@PathVariable Long id) {
        if (movieRepository.existsById(id)) {
            movieRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
