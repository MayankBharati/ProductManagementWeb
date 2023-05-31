package com.bharati.ProductManagementWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @GetMapping("/product/{name}")
    public Product getProduct(@PathVariable String name) {
        return service.getProduct(name);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product p) {
        service.addProduct(p);
    }

}
