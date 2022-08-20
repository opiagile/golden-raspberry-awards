package com.texo.app.api.movies.response;

import lombok.Data;

import java.util.List;

@Data
public class WinnersResponse {

    private List<AwardProducerResponse> min;
    private List<AwardProducerResponse> max;

}
