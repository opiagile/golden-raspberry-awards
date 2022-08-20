package com.texo.app.api.movies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.texo.app.api.movies.models.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

    List<Movie> findByWinnerTrueOrderByYearAsc();
    
}
