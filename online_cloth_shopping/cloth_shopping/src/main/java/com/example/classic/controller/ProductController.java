package com.example.classic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.classic.model.Product;
import com.example.classic.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/addproduct")
	public Product addProduct(Product product) {
		return productService.addProduct(product);
	}
	
	@GetMapping("/getallproduct")
	public List<Product> getAllProduct(){
		return productService.getAllProduct();
		
	}
	@GetMapping("/product")
    public String showProductsPage() {
        return "products";
    }
}
