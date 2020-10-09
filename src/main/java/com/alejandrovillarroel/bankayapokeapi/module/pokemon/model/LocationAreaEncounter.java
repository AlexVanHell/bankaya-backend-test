package com.alejandrovillarroel.bankayapokeapi.module.pokemon.model;

public class LocationAreaEncounter {
    private LocationArea location_area;
    private VersionEncounterDetail version_detail;

    public LocationArea getLocationArea() {
        return location_area;
    }

    public void setLocationArea(LocationArea locationArea) {
        this.location_area = locationArea;
    }

    public LocationArea getLocation_area() {
        return location_area;
    }

    public void setLocation_area(LocationArea location_area) {
        this.location_area = location_area;
    }

    public VersionEncounterDetail getVersionDetail() {
        return version_detail;
    }

    public void setVersionDetail(VersionEncounterDetail versionDetail) {
        this.version_detail = versionDetail;
    }
}
