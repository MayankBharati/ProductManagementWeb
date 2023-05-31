package com.bharati.ProductManagementWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductDB db;
//    public void show() {
//        System.out.println("In Show");
//    }
//    List<Product> products = new ArrayList<>();
//    ProductDB db = new ProductDB();

    public void addProduct(Product p) {
        db.save(p);
    }
//
    public List<Product> getAllProducts() {
        return db.findAll();
    }
//
////    public List<Product> getAllproducts() {
////        return products;
////    }
//
    public Product getProduct(String name) {
        return db.findByName(name);
    }
//
//    public List<Product> getProductWithText(String text) {
//        text = text.toLowerCase();
//        List<Product> prods = new ArrayList<>();
//
//        for(Product p: products) {
//            String name = p.getName().toLowerCase();
//            String place = p.getPlace().toLowerCase();
//            String type = p.getType().toLowerCase();
//            if(name.contains(text) || place.contains(text) || type.contains(text)) {
//                prods.add(p);
//            }
//        }
//
//        return products;
//    }
}
