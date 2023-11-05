package com.example.ecommerceservice.controller;

import com.example.ecommerceservice.dto.ProductListResponseDTO;
import com.example.ecommerceservice.dto.ProductResponseDTO;
import com.example.ecommerceservice.service.FakeStoreProductServiceImpl;
import com.example.ecommerceservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    @Qualifier("fakeStoreProductService")
    public FakeStoreProductServiceImpl productService;

    @GetMapping("/products")
    public ResponseEntity getProducts(){
        ProductListResponseDTO response = productService.getProducts();
        return ResponseEntity.ok(response);
    }
}
