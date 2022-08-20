package com.texo.app.api.movies.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AwardProducerResponse {

	private String producer;

	private Integer interval;
	
	private Integer previousWin;
	
	private Integer followingWin;

}
