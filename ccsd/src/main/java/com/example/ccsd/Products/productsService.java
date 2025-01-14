package com.example.ccsd.Products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class productsService {

    @Autowired
    private productsRepository productsRepository;

    public List<products> getAllProducts() {
        return productsRepository.findAll(); // Fetch all products
    }

    public Optional<products> getProductsById(String id) {
        return productsRepository.findById(id); // Fetch product by ID
    }

    public products addProducts(products product) {
        return productsRepository.save(product); // Save new product
    }

    public products updateProducts(String id, products productDetails) {
        return productsRepository.findById(id).map(product -> {
            // Update fields
            product.setTitle(productDetails.getTitle());
            product.setPostSlug(productDetails.getPostSlug());
            product.setPostShortDescription(productDetails.getPostShortDescription());
            product.setTag(productDetails.getTag());
            product.setPlace(productDetails.getPlace());
            product.setDateProduct(productDetails.getDateProduct());
            product.setStatus(productDetails.getStatus());
            product.setImageStore(productDetails.getImageStore());
            return productsRepository.save(product); // Save updated product
        }).orElse(null);
    }

    public void deleteProducts(String id) {
        productsRepository.deleteById(id); // Delete product by ID
    }
}
