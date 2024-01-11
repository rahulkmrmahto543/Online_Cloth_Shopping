package com.example.classic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.classic.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
