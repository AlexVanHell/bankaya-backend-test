package com.alejandrovillarroel.bankayapokeapi.module.pokemon.model;

public class FlavorTextEntry {
    private String flavor_text;
    private VersionGroup version_group;

    public String getFlavorText() {
        return flavor_text;
    }

    public void setFlavorText(String flavorText) {
        this.flavor_text = flavorText;
    }

    public VersionGroup getVersionGroup() {
        return version_group;
    }

    public void setVersionGroup(VersionGroup versionGroup) {
        this.version_group = versionGroup;
    }
}
