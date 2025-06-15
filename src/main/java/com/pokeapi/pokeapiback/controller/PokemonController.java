package com.pokeapi.pokeapiback.controller;
import com.pokeapi.pokeapiback.model.PokemonModel;
import com.pokeapi.pokeapiback.service.PokemonService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/{name}")
    public PokemonModel getPokemonByName(@PathVariable String name) {
        return pokemonService.getPokemonByName(name);
    }
}
