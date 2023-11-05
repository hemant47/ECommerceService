package com.example.ecommerceservice.service;

import com.example.ecommerceservice.dto.ProductListResponseDTO;
import com.example.ecommerceservice.model.Product;

import java.util.List;

public interface ProductService {
    ProductListResponseDTO getProducts();
    Product getProductById(int id);
    Product createProduct(Product product);
    Product deleteProduct(int id);
    Product updateProduct(int id, Product updatedProduct);

}
