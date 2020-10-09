package com.alejandrovillarroel.bankayapokeapi.module.pokemon.model;

public class PokemonEncounter {
    private Pokemon pokemon;
    private VersionEncounterDetail version_encounter_detail;

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public VersionEncounterDetail getVersionEncounterDetail() {
        return version_encounter_detail;
    }

    public void setVersionEncounterDetail(VersionEncounterDetail versionEncounterDetail) {
        this.version_encounter_detail = versionEncounterDetail;
    }
}
