package com.tothemoon.moonlight.api;

import com.tothemoon.moonlight.core.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "categories")
public class CategoryAPI {

  @GetMapping
  public List<Category> toList() {

    Category cat1 = Category.builder()
        .name("baianinho")
        .id(204)
        .build();

    Category cat2 = Category.builder()
        .name("armando costa")
        .id(456)
        .build();

    List<Category> list = Arrays.asList(cat1, cat2);

    return list;
  }

}
