package com.alejandrovillarroel.bankayapokeapi.module.pokemon.model;

import java.util.ArrayList;

public class Ability extends PokemonNamedApiResource {
    private int id;
    private boolean isMainSeries;
    private Generation generation;
    private ArrayList<Name> names;
    private ArrayList<EffectEntry> effectEntries;
    private ArrayList<EffectChange> effectChanges;
    private ArrayList<FlavorTextEntry> flavorTextEntries;
    private Pokemon pokemon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMainSeries() {
        return isMainSeries;
    }

    public void setMainSeries(boolean isMainSeries) {
        this.isMainSeries = isMainSeries;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

    public ArrayList<EffectEntry> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(ArrayList<EffectEntry> effectEntries) {
        this.effectEntries = effectEntries;
    }

    public ArrayList<EffectChange> getEffectChanges() {
        return effectChanges;
    }

    public void setEffectChanges(ArrayList<EffectChange> effectChanges) {
        this.effectChanges = effectChanges;
    }

    public ArrayList<FlavorTextEntry> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    public void setFlavorTextEntries(ArrayList<FlavorTextEntry> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}
