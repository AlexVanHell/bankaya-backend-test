package com.alejandrovillarroel.bankayapokeapi.module.pokemon.model;

import java.util.ArrayList;

public class EffectChange {
    private VersionGroup version_group;
    private ArrayList<EffectEntry> effect_entries;

    public VersionGroup getVersionGroup() {
        return version_group;
    }

    public void setVersionGroup(VersionGroup versionGroup) {
        this.version_group = versionGroup;
    }

    public ArrayList<EffectEntry> getEffectEntries() {
        return effect_entries;
    }

    public void setEffectEntries(ArrayList<EffectEntry> effectEntries) {
        this.effect_entries = effectEntries;
    }
}
