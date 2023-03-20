package com.github.vinyprogramador.exerciseresponseentity;

//Nome: Vinicius A Nunes
//RA: 01221125

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    List<Movie> movies = new ArrayList<>();

    //show all movies
    @GetMapping
    public ResponseEntity<List<Movie>> showAll() {
        if (movies.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(movies);
    }

    //search for index
    @GetMapping("/{index}")
    public ResponseEntity<Movie> searchByIndex(@PathVariable int index) {
        if (index > movies.size() || index < 0) {
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.status(200).body(this.movies.get(index));
    }

    // add a new movie with rules
    @PostMapping
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
        if (movie.getName().length() >= 2 && movie.getLaunchYear() > 1895) {
            movies.add(movie);
            return ResponseEntity.status(201).body(movie);
        }
        return ResponseEntity.status(400).build();
    }

    //update movie
    @PutMapping
    public ResponseEntity<Movie> updateMovie(@PathVariable int index, @RequestBody Movie movie){
        if (index > movies.size() || index < 0 ){
            return ResponseEntity.status(400).build();
        }
        this.movies.set(index, movie);
        return ResponseEntity.status(200).body(movie);
    }

    //update oscars
    @PatchMapping("/{index}/oscars")
    public ResponseEntity<Movie> updateAmountOscars(@PathVariable int index, @RequestBody UpdateOscarJson quantity) {
        if (index >= 0 && index < movies.size()) {
            movies.get(index).setOscarQuantity(quantity.getAmountOscar());
            return ResponseEntity.status(200).body(movies.get(index));
        }
        return ResponseEntity.status(404).build();
    }
}
