package com.example.client;

import com.example.api.PlaneDto;
import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
public class Controller {
    @GetMapping("/")
    public ResponseEntity<String> get() throws IOException, InterruptedException {
        return ResponseEntity.ok("Hello, World!" + "\n" + getFromHttpRequest());
    }

    private String getFromHttpRequest() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/"))
                .build();
        HttpResponse<String> body = client.send(request, HttpResponse.BodyHandlers.ofString());
        return body.body();
    }
}
