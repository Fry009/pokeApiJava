package com.pokeapi.pokeapiback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PokemonModel {

    @Id
    private int id;
    private String name;
    private int height;
    private int weight;

    public PokemonModel() {}

    public PokemonModel(int id, String name, int height, int weight) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // Getters y setters
}
