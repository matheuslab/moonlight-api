package com.tothemoon.moonlight.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "categories")
public class CategoryAPI {

  @GetMapping
  public String toList() {
    return "REST is working!";
  }

}
