package com.example.shop.controllers;

import com.example.shop.ProductService;
import com.example.shop.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
@Autowired
    ProductService productService;

@PostMapping("/addProduct")
public Product addProduct (@RequestBody Product product){
    return productService.saveProduct(product);
}

@PostMapping("/addProducts")
public List<Product> addProducts(@RequestBody List<Product> products){
    return productService.getProducts();
}

@GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getPoductById(id);
    }

@GetMapping("/product/{name}")
    public Product getProductByName(@PathVariable String name){
        return productService.getPoductById(Integer.parseInt(name));
    }

@GetMapping("/products")
    public List<Product> findAllProducts(){
    return productService.getProducts();
}

@PostMapping("/update")
    public Product updateProduct (@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct (@PathVariable int id ){
    return productService.deleteProduct(id);
    }
}
