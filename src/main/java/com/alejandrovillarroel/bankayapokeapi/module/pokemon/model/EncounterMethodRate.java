package com.alejandrovillarroel.bankayapokeapi.module.pokemon.model;

import java.util.ArrayList;

public class EncounterMethodRate {
    private EncounterMethod encounter_method;
    private ArrayList<EncounterVersionDetail> version_detail;

    public EncounterMethod getEncounterMethod() {
        return encounter_method;
    }

    public void setEncounterMethod(EncounterMethod encounterMethod) {
        this.encounter_method = encounterMethod;
    }

    public ArrayList<EncounterVersionDetail> getVersionDetail() {
        return version_detail;
    }

    public void setVersionDetail(ArrayList<EncounterVersionDetail> versionDetail) {
        this.version_detail = versionDetail;
    }
}
