package com.example.classic.service;

import java.util.List;

import com.example.classic.model.Product;

public interface ProductService {
	
	public Product addProduct(Product product);
	public List<Product> getAllProduct();

}
