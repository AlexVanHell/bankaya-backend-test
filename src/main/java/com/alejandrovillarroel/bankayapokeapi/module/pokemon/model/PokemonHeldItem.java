package com.alejandrovillarroel.bankayapokeapi.module.pokemon.model;

public class PokemonHeldItem {
    private Item item;
    private PokemonHeldItemVersion version_details;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public PokemonHeldItemVersion getVersionDetails() {
        return version_details;
    }

    public void setVersionDetails(PokemonHeldItemVersion versionDetails) {
        this.version_details = versionDetails;
    }
}
