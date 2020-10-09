package com.alejandrovillarroel.bankayapokeapi.module.pokemon.model;

public class Item extends PokemonNamedApiResource {
    private int id;
    private int cost;
    private int fling_power;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getFlingPower() {
        return fling_power;
    }

    public void setFlingPower(int flingPower) {
        this.fling_power = flingPower;
    }
}
