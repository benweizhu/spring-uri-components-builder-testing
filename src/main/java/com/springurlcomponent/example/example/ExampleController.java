package com.springurlcomponent.example.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

  @GetMapping(value = "/url")
  public String urlComponent() {
    return "url";
  }
}
