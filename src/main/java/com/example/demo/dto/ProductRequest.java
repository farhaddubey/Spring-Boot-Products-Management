package com.example.demo.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class ProductRequest {

    @NotBlank(message = "Name required")
    private String name;

    @Min(value = 1, message = "Price must be positive")
    private double price;

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double Price) {
        this.price = price; 
    }
}
