package com.alejandrovillarroel.bankayapokeapi.common.http;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class HttpClient {

    public <T> T get(String uri, Class<T> responseType) {
        RestTemplate restTemplate = new RestTemplate();

        try {
            ResponseEntity<T> response = restTemplate.getForEntity(uri, responseType);
            return response.getBody();
        } catch (RestClientException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    public <T> ArrayList<T> getList(String uri, ParameterizedTypeReference<ArrayList<T>> responseType) {
        RestTemplate restTemplate = new RestTemplate();

        try {
            ResponseEntity<ArrayList<T>> response = restTemplate.exchange(uri, HttpMethod.GET, null, responseType);

            return response.getBody();
        } catch (RestClientException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }
}
