package com.springurlcomponent.example.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class ExampleController {

  @GetMapping(value = "/url/{id}")
  public String urlComponent(String id) {
    return UriComponentsBuilder.fromUriString("history")
        .pathSegment(id)
        .path("history")
        .queryParam("filter[number]", "10").toUriString();
  }
}
