package com.alejandrovillarroel.bankayapokeapi.module.pokemon.model;

import java.util.ArrayList;

public class Pokemon extends PokemonNamedApiResource {
    private String id;
    private int baseExperience;
    private ArrayList<PokemonAbility> abilities;
    private ArrayList<PokemonHeldItem> heldItems;
    private String location_area_encounters;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public ArrayList<PokemonAbility> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<PokemonAbility> abilities) {
        this.abilities = abilities;
    }

    public ArrayList<PokemonHeldItem> getHeldItems() {
        return heldItems;
    }

    public void setHeldItems(ArrayList<PokemonHeldItem> heldItems) {
        this.heldItems = heldItems;
    }

    public String getLocationAreaEncounters() {
        return location_area_encounters;
    }

    public void setLocationAreaEncounters(String locationAreaEncounters) {
        this.location_area_encounters = locationAreaEncounters;
    }
}
