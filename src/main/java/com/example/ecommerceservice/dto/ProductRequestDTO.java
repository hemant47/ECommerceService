package com.example.ecommerceservice.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequestDTO {
    public int id;
    public String title;
    public double price;
    public String description;
    public String category;
    public String image;
}
