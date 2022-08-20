package com.texo.app.api.movies;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AppApiMoviesApplicationTests {

	private final HttpHeaders headers = new HttpHeaders();

	private final TestRestTemplate template = new TestRestTemplate();

	@LocalServerPort
	private int port;

	@Test
	public void testMinMaxIntervalBetweenTwoAwards() throws Exception {
		HttpEntity<String> entity = new HttpEntity<>(null, headers);
		ResponseEntity<String> response = template.exchange(createURLWithPort("/movies/min-max-interval-awards"),
				HttpMethod.GET, entity, String.class);
		String expected = "{\"min\":[{\"producer\":\"Bo Derek\",\"interval\":6,\"previousWin\":1984,\"followingWin\":1990}],"
				+ "\"max\":[{\"producer\":\"Bo Derek\",\"interval\":6,\"previousWin\":1984,\"followingWin\":1990}]}";
		JSONAssert.assertEquals(expected, response.getBody(), false);
	}

	@Test
	public void testStatusCodeSuccess() {
		ResponseEntity<String> response = template.getForEntity(createURLWithPort("/movies/min-max-interval-awards"),
				String.class);
		assertThat(response.getStatusCodeValue()).isEqualTo(200);
	}

	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}
}
