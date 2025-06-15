package com.pokeapi.pokeapiback.service;

import com.pokeapi.pokeapiback.model.PokemonModel;
import com.pokeapi.pokeapiback.repository.PokemonRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {

    private final RestTemplate restTemplate;
    private final PokemonRepository pokemonRepository;

    private final String BASE_URL = "https://pokeapi.co/api/v2/pokemon/";

    public PokemonService(RestTemplate restTemplate, PokemonRepository pokemonRepository) {
        this.restTemplate = restTemplate;
        this.pokemonRepository = pokemonRepository;
    }

    public PokemonModel getPokemonByName(String name) {
        PokemonModel existing = pokemonRepository.findByName(name);
        if (existing != null) return existing;

        PokemonModel fetched = restTemplate.getForObject(BASE_URL + name.toLowerCase(), PokemonModel.class);
        if (fetched != null) {
            pokemonRepository.save(fetched);
        }
        return fetched;
    }
}
