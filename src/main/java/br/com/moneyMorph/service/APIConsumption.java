package br.com.moneyMorph.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * This class is responsible for consuming APIs.
 * It contains a method to send a GET request to a given URL and return the response body as a string.
 */
public class APIConsumption {

    /**
     * This method sends a GET request to the given URL and returns the response body as a string.
     * It uses the HttpClient class to send the request and receive the response.
     * If am IOException or InterruptedException occurs, it throws a RuntimeException.
     *
     * @param url the URL to which the GET request will be sent.
     * @return the response body as a string.
     * @throws RuntimeException if an IOException or InterruptedException occurs.
     */
    public String getData(String url) {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = null;
        try {
            response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

        } catch (IOException | InterruptedException e ) {
            throw new RuntimeException(e);
        }

        return response.body();
    }

}
