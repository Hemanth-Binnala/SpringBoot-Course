package com.Hemanthdemo.demoApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hemanthdemo.demoApp.model.Products;
import com.Hemanthdemo.demoApp.repository.ProductRepo;

@Service
public class JpaProductService {
    @Autowired
    ProductRepo Repo;

        public List<Products> getProducts(){
        return Repo.findAll();
    }

    public Products getProductsById(int prodId) {                                            // GET METHOD
        return Repo.findById(prodId).orElse(new Products());
    }

    public void addProduct(Products prod){                                                  // PUT METHOD
        Repo.save(prod);
    }

     public void updateProduct(Products prod){                                               // UPDATE METHOD
        Repo.save(prod);
    }

    public void deleteProduct(int prodId){                                                  // DELETE METHOD
        Repo.deleteById(prodId);
    }
}

