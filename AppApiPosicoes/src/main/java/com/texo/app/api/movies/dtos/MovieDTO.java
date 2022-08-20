package com.texo.app.api.movies.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO {

    private Integer year;

    private String title;
    
    private String studio;
    
    private String producer;
    
    private Boolean winner;
    
}
