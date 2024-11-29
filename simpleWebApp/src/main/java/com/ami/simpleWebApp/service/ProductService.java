package com.ami.simpleWebApp.service;

import com.ami.simpleWebApp.model.Product;
import com.ami.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    /*List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Canon Camera", 70000),
            new Product(103, "Shure Mic", 40000)));*/

    public List<Product> getProducts() {

        return repo.findAll();
        /*return products;*/
    }

    public Product getProductById(int prodId) {

        return repo.findById(prodId).orElse(new Product());
        /*return products.stream()
                .filter(p -> p.getProdID() == prodId)
                .findFirst().orElse(new Product(100, "No item", 0));*/
    }

    public void addProduct(Product prod) {

        repo.save(prod);
        /*products.add(prod);*/
    }

    public void updateProduct(Product prod) {

        repo.save(prod);
        /*int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdID() == prod.getProdID())
                index = i;
            products.set(index, prod);
        }*/
    }

    public void deleteProduct(int prodId) {

        repo.deleteById(prodId);
        /*int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdID() == prodId)
                index = i;
        }
        products.remove(index);*/
    }
}
