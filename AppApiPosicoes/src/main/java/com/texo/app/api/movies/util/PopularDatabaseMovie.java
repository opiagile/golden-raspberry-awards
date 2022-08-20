package com.texo.app.api.movies.util;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.texo.app.api.movies.models.Movie;
import com.texo.app.api.movies.repository.MovieRepository;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Configuration
public class PopularDatabaseMovie {

	@Bean
	CommandLineRunner initDatabase(MovieRepository movieRepository) {

		List<String[]> movies = moviesCSV();

		return args -> {
			for (String[] registro : movies) {
				movieRepository.save(new Movie(Integer.parseInt(registro[0]), registro[1], registro[2], registro[3],
						registro[4].equals("yes") ? true : false));
			}
		};

	}

	private List<String[]> moviesCSV() {
		List<String[]> movies = null;

		try {
			Reader reader = Files.newBufferedReader(Paths.get(".\\datas\\movielist.csv"));
			CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1)
					.withCSVParser(new CSVParserBuilder().withSeparator(';').build()).build();
			;
			movies = csvReader.readAll();
			csvReader.close();
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return movies;
	}

}
