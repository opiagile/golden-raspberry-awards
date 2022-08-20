package com.texo.app.api.movies.mappers;

import com.texo.app.api.movies.dtos.MovieDTO;
import com.texo.app.api.movies.models.Movie;

public class MovieMapper {

    public static MovieDTO toDTO(Movie movie) {
        return MovieDTO.builder()
                .year(movie.getYear())
                .producer(movie.getProducer())
                .studio(movie.getStudio())
                .title(movie.getTitle())
                .winner(movie.getWinner())
                .build();
    }

}
