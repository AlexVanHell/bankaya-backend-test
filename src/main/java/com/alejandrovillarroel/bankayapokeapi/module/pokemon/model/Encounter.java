package com.alejandrovillarroel.bankayapokeapi.module.pokemon.model;

public class Encounter {
    private int min_level;
    private int max_level;
    private EncounterConditionValue condition_value;
    private int chance;
    private EncounterMethod method;

    public int getMinLevel() {
        return min_level;
    }

    public void setMinLevel(int minLevel) {
        this.min_level = minLevel;
    }

    public int getMaxLevel() {
        return max_level;
    }

    public void setMaxLevel(int maxLevel) {
        this.max_level = maxLevel;
    }

    public EncounterConditionValue getConditionValue() {
        return condition_value;
    }

    public void setConditionValue(EncounterConditionValue conditionValue) {
        this.condition_value = conditionValue;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public EncounterMethod getMethod() {
        return method;
    }

    public void setMethod(EncounterMethod method) {
        this.method = method;
    }
}
