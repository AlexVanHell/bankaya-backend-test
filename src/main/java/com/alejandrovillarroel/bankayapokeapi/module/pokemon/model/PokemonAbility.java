package com.alejandrovillarroel.bankayapokeapi.module.pokemon.model;

public class PokemonAbility {
    private boolean is_hidden;
    private int slot;
    private Ability ability;

    public boolean isHidden() {
        return is_hidden;
    }

    public void setHidden(boolean hidden) {
        is_hidden = hidden;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }
}
