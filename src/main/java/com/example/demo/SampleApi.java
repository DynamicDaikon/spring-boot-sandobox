package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SampleApi {
  @GetMapping("sample")
  public String samplePost() {
    return "hello spring-boot";
  }
}
