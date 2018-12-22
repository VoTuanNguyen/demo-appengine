package com.example.demo;

// Add imports
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {
  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @GetMapping("/")
  public String hello() {
    return "Xin chào NguyenVT2!";
  }
}