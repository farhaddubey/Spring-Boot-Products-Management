package com.example.demo.controller;

import com.example.demo.dto.ProductRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public ResponseEntity<String> getProducts() {
        return ResponseEntity.ok("Product Found.");
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable Long id) {
        return "Product id is : " + id;
    }

    @GetMapping("/search")
    public String search(@RequestParam String name) {
        return "Searching : " + name;
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@Valid @RequestBody ProductRequest request) {
        return ResponseEntity.ok(request);
    }

}
