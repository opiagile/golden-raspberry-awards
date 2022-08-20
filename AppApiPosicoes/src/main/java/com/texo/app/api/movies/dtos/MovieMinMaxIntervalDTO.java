package com.texo.app.api.movies.dtos;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieMinMaxIntervalDTO {

    private List<MovieIntervalDTO> min = new ArrayList<>();
    private List<MovieIntervalDTO> max = new ArrayList<>();

}
