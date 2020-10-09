package com.alejandrovillarroel.bankayapokeapi.module.pokemon.model;

import java.util.ArrayList;

public class Generation extends PokemonNamedApiResource {
    private int id;
    private ArrayList<Ability> abilities;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Ability> abilities) {
        this.abilities = abilities;
    }
}
