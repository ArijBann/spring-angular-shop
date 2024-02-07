package com.example.shop.controllers;

import com.example.shop.service.ProductService;
import com.example.shop.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
@Autowired
    ProductService productService;

@PostMapping("/addProduct")
public Product addProduct (@RequestBody Product product){
    return productService.saveProduct(product);
}

@PostMapping("/addProducts")
public void addProducts(@RequestBody List<Product> products){
    productService.saveProducts(products);
}

@GetMapping("/productById/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getPoductById(id);
    }

@GetMapping("/productByName/{name}")
    public Product getProductByName(@PathVariable String name){
        return productService.getProductByName(name);
    }

@GetMapping("/products")
    public List<Product> findAllProducts(){
    return productService.getProducts();
}

@PutMapping("/update")
    public Product updateProduct (@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct (@PathVariable int id ){
    return productService.deleteProduct(id);
    }
}
