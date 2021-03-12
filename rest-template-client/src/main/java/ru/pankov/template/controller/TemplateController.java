package ru.pankov.template.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class TemplateController {

    private final RestTemplate restTemplate;

    @GetMapping("/")
    public String getProducts() {
        String data = restTemplate.getForObject("http://localhost:8189/product/api/v1/", String.class);

        return "data: " + data;
    }
}
