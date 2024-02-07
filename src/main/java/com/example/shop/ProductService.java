package com.example.shop;

import com.example.shop.models.Product;
import com.example.shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


    public Product getPoductById(int id){
        return productRepository.findById(id).orElse(null);
    }


    public Product getProductByName(String name){
        return productRepository.getProductByName(name);
    }

    public List <Product> getProducts(){
        return productRepository.findAll();
    }
    public Product saveProduct(Product product){
        productRepository.save(product);
        return product;
    }

    public void saveProducts(List<Product> products){
        productRepository.saveAll(products);
    }

    public String deleteProduct (int id){
        productRepository.deleteById(id);
        return "Deleted Successfully !";
    }
    public Product updateProduct(Product product){
        Product existingproduct = productRepository.findById(product.getId()).orElse(null);
        existingproduct.setName(product.getName());
        existingproduct.setPrice(product.getPrice());
        existingproduct.setQuantity(product.getQuantity());
        return existingproduct;
    }
}
