package com.alejandrovillarroel.bankayapokeapi.module.pokemon.service;

import com.alejandrovillarroel.bankayapokeapi.common.http.HttpClient;
import com.alejandrovillarroel.bankayapokeapi.config.ConfigService;
import com.alejandrovillarroel.bankayapokeapi.constant.PokeApiEndpoint;
import com.alejandrovillarroel.bankayapokeapi.module.pokemon.model.LocationAreaEncounter;
import com.alejandrovillarroel.bankayapokeapi.module.pokemon.model.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PokemonService {
    private ConfigService configService;
    private HttpClient httpClient;

    @Autowired
    public PokemonService(ConfigService configService, HttpClient httpClient) {
        this.configService = configService;
        this.httpClient = httpClient;
    }

    /**
     * Get concatenated pokeapi url with any specific partial endpoint
     *
     * @param partialEndpoint Value of partial endpoint
     * @return Full url
     */
    private String getFullEndpoint(String partialEndpoint) {
        String baseEndpoint = this.configService.getProperty("pokeapi.url");

        if (!partialEndpoint.startsWith("/")) {
            partialEndpoint = "/" + partialEndpoint;
        }

        String url = new StringBuilder()
                .append(baseEndpoint)
                .append(partialEndpoint)
                .toString();

        return url;
    }

    /**
     * Replace "{name}" parameter in url for a value
     *
     * @param url Url that contains "{name}"
     * @param name Name value
     * @return Url with "{name}" replaced
     */
    private String replaceNameInUrl(String url, String name) {
        return url.replaceFirst("\\{name\\}", name);
    }

    /**
     * Get pokemon object
     *
     * @param name Pokemon name or id
     * @return Pokemon object
     */
    public Pokemon getPokemon(String name) {
        String endpoint = this.getFullEndpoint(
                this.replaceNameInUrl(PokeApiEndpoint.POKEMON, name)
        );

        return this.httpClient.get(endpoint, Pokemon.class);
    }

    /**
     * Get Location area encounters by pokemon name or id
     *
     * @param name Pokemon name or id
     * @return
     */
    public ArrayList<LocationAreaEncounter> getLocationAreaEncountersByPokemon(String name) {
        String endpoint = this.getFullEndpoint(
                this.replaceNameInUrl(PokeApiEndpoint.LOCATION_AREA_ENCOUNTERS, name)
        );

        return this.httpClient.getList(
                endpoint,
                new ParameterizedTypeReference<ArrayList<LocationAreaEncounter>>() {}
        );
    }

}
