package com.Hemanthdemo.demoApp.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Products {

    @Id
    private int prodId;
    private String brand;
    private int price;

    public Products(){
        
    }

    public Products(int prodId, String brand,int price){
        this.prodId=prodId;
        this.brand=brand;
        this.price=price;
    }

    public int getProdId(){
        return prodId;
    }

    public void setProdId(int prodId){
        this.prodId = prodId;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public int getPrice(){
        return price; 
    }

    public void setPrice(int price){
        this.price= price;
    }

}
