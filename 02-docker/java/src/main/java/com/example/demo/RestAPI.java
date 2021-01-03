package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {

  @GetMapping("/")
  public String home() {
    return "<h1>Java Instace: </h1>";
  }
}