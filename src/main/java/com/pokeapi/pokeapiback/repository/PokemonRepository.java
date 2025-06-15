package com.pokeapi.pokeapiback.repository;

import com.pokeapi.pokeapiback.model.PokemonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<PokemonModel, Integer> {
    PokemonModel findByName(String name);
}
