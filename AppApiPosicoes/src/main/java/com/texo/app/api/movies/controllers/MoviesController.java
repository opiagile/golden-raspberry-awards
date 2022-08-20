package com.texo.app.api.movies.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.texo.app.api.movies.repository.MovieRepository;
import com.texo.app.api.movies.response.WinnersResponse;
import com.texo.app.api.movies.services.MovieService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/movies")
@RequiredArgsConstructor
public class MoviesController {

	private final MovieService movieService;

	@Autowired
	MovieRepository movieRepository;

	@RequestMapping(value = "/status/check", method = RequestMethod.GET)
	public String status() {
		return "Movies working";
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List> getAllMovies() {
		List movies = movieService.fetchAllMovies();
		return ResponseEntity.ok().body(movies);
	}

	@RequestMapping(value = "/min-max-interval-awards", method = RequestMethod.GET)
	public ResponseEntity<WinnersResponse> minMaxIntervalTwoAwards() {
		WinnersResponse dto = movieService.fetchWinners();
		return ResponseEntity.ok().body(dto);
	}

}
