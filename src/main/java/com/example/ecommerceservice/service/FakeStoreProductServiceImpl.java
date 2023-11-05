package com.example.ecommerceservice.service;

import com.example.ecommerceservice.dto.ProductListResponseDTO;
import com.example.ecommerceservice.dto.ProductResponseDTO;
import com.example.ecommerceservice.model.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("fakeStoreProductService")
public class FakeStoreProductServiceImpl implements ProductService{
    private RestTemplateBuilder restTemplateBuilder;

    FakeStoreProductServiceImpl(RestTemplateBuilder restTemplateBuilder){
        this.restTemplateBuilder = restTemplateBuilder;
    }
    @Override
    public ProductListResponseDTO getProducts() {
        String getAllProductURL = "https://fakestoreapi.com/products";
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<ProductResponseDTO[]> productResponseArray = restTemplate.getForEntity(getAllProductURL, ProductResponseDTO[].class);
        ProductListResponseDTO productListResponseDTO = new ProductListResponseDTO();
        for(ProductResponseDTO productResponseDTO: productResponseArray.getBody()){
            productListResponseDTO.getProducts().add(productResponseDTO);
        }
        return productListResponseDTO;

    }

    @Override
    public Product getProductById(int id) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product deleteProduct(int id) {
        return null;
    }

    @Override
    public Product updateProduct(int id, Product updatedProduct) {
        return null;
    }
}
