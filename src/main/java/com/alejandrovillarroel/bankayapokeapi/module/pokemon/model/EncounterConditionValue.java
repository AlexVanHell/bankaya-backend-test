package com.alejandrovillarroel.bankayapokeapi.module.pokemon.model;

import java.util.ArrayList;

public class EncounterConditionValue extends PokemonNamedApiResource {
    private int id;
    private EncounterCondition condition;
    private ArrayList<Name> names;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EncounterCondition getCondition() {
        return condition;
    }

    public void setCondition(EncounterCondition condition) {
        this.condition = condition;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }
}
