package com.Hemanthdemo.demoApp.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import com.Hemanthdemo.demoApp.model.Products;


@Service
public class ProductService {

    List<Products> Products = new ArrayList<>(Arrays.asList(new Products
    (101,"dell",40000),
    new Products(102,"lenova",50000),
    new Products(103,"Asus",100000)));

    public List<Products> getProducts(){
        return Products;
    }

    public Products getProductsById(int prodId) {                                            // GET METHOD
        return Products.stream().filter(p -> p.getProdId() == prodId).findFirst().get();
    }

    public void addProduct(Products prod){                                                  // PUT METHOD
        Products.add(prod);
    }

    public void updateProduct(Products prod){                                               // UPDATE METHOD
        int index = 0;
        for(int i=0;i<Products.size();i++){
            if(Products.get(i).getProdId() == prod.getProdId()){
                index = i;
            }
        }
        Products.set(index,prod);
    }

    public void deleteProduct(int prodId){                                                  // DELETE METHOD
        int index = 0;
        for(int i=0;i < Products.size();i++){
            if(Products.get(i).getProdId() == prodId){
                index = i;
            }
        }
        Products.remove(index);
    }




}
