package dev.ritik.movies.movies;

import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;
    public List<Movie> findAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> findByImdbId(String imdbId) {
        //todo handel exception
        return movieRepository.findByImdbId(imdbId);
    }
}