package com.alejandrovillarroel.bankayapokeapi.module.pokemon.model;

import java.util.ArrayList;

public class LocationArea extends PokemonNamedApiResource {
    private int id;
    private int game_index;
    private Location location;
    private ArrayList<EncounterMethodRate> encounter_method_rates;
    private ArrayList<Name> names;
    private ArrayList<PokemonEncounter> pokemon_encounters;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGameIndex() {
        return game_index;
    }

    public void setGameIndex(int gameIndex) {
        this.game_index = gameIndex;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ArrayList<EncounterMethodRate> getEncounterMethodRates() {
        return encounter_method_rates;
    }

    public void setEncounterMethodRates(ArrayList<EncounterMethodRate> encounterMethodRates) {
        this.encounter_method_rates = encounterMethodRates;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

    public ArrayList<PokemonEncounter> getPokemonEncounters() {
        return pokemon_encounters;
    }

    public void setPokemonEncounters(ArrayList<PokemonEncounter> pokemonEncounters) {
        this.pokemon_encounters = pokemonEncounters;
    }
}
