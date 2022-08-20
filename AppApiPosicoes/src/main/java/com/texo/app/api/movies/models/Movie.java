package com.texo.app.api.movies.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Movie {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Long id;    
	
	@Column(name = "year")
	private Integer year;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "studio")
	private String studio;
	
	@Column(name = "producer")
	private String producer;
	
	@Column(name = "winner")
	private Boolean winner;
	    
    public Movie(Integer year, String title, String studio, String producer, Boolean winner) {
        this.year = year;
        this.title = title;
        this.studio = studio;
        this.producer = producer;
        this.winner = winner;
    }
	
}
