package com.alejandrovillarroel.bankayapokeapi.module.pokemon.model;

public class VersionEncounterDetail {
    private Version version;
    private int max_chance;
    private Encounter encounter_details;

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public int getMaxChance() {
        return max_chance;
    }

    public void setMaxChance(int maxChance) {
        this.max_chance = maxChance;
    }

    public Encounter getEncounterDetails() {
        return encounter_details;
    }

    public void setEncounterDetails(Encounter encounterDetails) {
        this.encounter_details = encounterDetails;
    }
}
