package com.example.shop.repository;

import com.example.shop.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product getProductByName(String name);
}
