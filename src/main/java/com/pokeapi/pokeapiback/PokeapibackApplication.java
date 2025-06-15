package com.pokeapi.pokeapiback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PokeapibackApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokeapibackApplication.class, args);
	}

	// ⚠️ Este es el bean que faltaba
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
