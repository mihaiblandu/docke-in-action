package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.stream.Collectors;


@RestController
public class RestAPI {

 
  @GetMapping("/")
  public String home() {
    // Create a client based on DOCKER_HOST and DOCKER_CERT_PATH env vars

    return "<h1>Java Instace: "+  System.getenv("HOSTNAME") +"</h1>";
  }
}