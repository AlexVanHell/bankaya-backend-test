package com.alejandrovillarroel.bankayapokeapi.module.pokemon.endpoint;

import com.alejandrovillarroel.bankayapokeapi.module.pokemon.request.PokemonRequest;
import com.alejandrovillarroel.bankayapokeapi.module.pokemon.response.PokemonResponse;
import com.alejandrovillarroel.bankayapokeapi.module.requestdata.service.RequestDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PokemonEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private RequestDataService requestDataService;

    @Autowired
    public PokemonEndpoint(RequestDataService requestDataService) {
        this.requestDataService = requestDataService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAbilitiesRequest")
    @ResponsePayload
    public PokemonResponse getAbilities(@RequestPayload PokemonRequest request) {
        PokemonResponse response = new PokemonResponse();

        // response.setCountry(countryRepository.findCountry(request.getName()));

        return response;
    }
}