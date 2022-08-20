package com.texo.app.api.movies.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieIntervalDTO implements Comparable<MovieIntervalDTO>{

    private String producer;
    
    private Integer interval;
    
    private Integer previousWin;
    
    private Integer followingWin;

	@Override
    public int compareTo(MovieIntervalDTO o) {
        if(this.interval==o.getInterval())
            return 0;
        else if(this.interval>o.getInterval())
            return 1;
        else
            return -1;
    }
}
