package com.Hemanthdemo.demoApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hemanthdemo.demoApp.model.Products;

@Repository
public interface ProductRepo extends JpaRepository<Products, Integer> {  // in the extends button we need to add two things Products - class name and Integer - primary key type

}
