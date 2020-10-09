package com.alejandrovillarroel.bankayapokeapi.module.pokemon.model;

import java.util.ArrayList;

public class EncounterMethod extends PokemonNamedApiResource {
    private int id;
    private int order;
    private ArrayList<Name> names;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }
}
