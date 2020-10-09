package com.alejandrovillarroel.bankayapokeapi.module.pokemon.model;

import java.util.ArrayList;

public class Version extends PokemonNamedApiResource {
    private int id;
    private ArrayList<Name> names;
    private VersionGroup version_group;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

    public VersionGroup getVersionGroup() {
        return version_group;
    }

    public void setVersionGroup(VersionGroup versionGroup) {
        this.version_group = versionGroup;
    }
}
