package com.Hemanthdemo.demoApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hemanthdemo.demoApp.model.Products;
import com.Hemanthdemo.demoApp.services.JpaProductService;

@RestController
public class JpaProductController {
     @Autowired
    JpaProductService service;

    @RequestMapping("/Jpaproducts")
    public List<Products> getProducts(){
        return service.getProducts();
    }

    @RequestMapping("/Jpaproducts/{prodId}")                                //GET BY DEFAULT REQUEST MAPPING WILL HAVE GET METHOD
    public Products getProductsById(@PathVariable int prodId){
        return service.getProductsById(prodId);
    }

    @PostMapping("/Jpaproducts")                                           //POST : FOR POST WE USE @POSTMAPPING ANNOTATION
    public void addProduct(@RequestBody Products prod){
        service.addProduct(prod);
    }
    @PutMapping("/Jpaproducts")
    public void updateProduct(@RequestBody Products prod){              // PUT 
        service.updateProduct(prod);
    }

    @DeleteMapping("/Jpaproducts/{prodId}")                                // DELETE
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}
