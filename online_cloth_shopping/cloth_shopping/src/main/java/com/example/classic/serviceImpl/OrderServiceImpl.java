package com.example.classic.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.classic.model.Product;
import com.example.classic.repository.ProductRepository;
import com.example.classic.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	ProductRepository productRepo;
	
	List<Product> productList = new ArrayList<>();

	@Override
	public List<Product> addToCart(int id) {
		Product product = productRepo.findById(id).get();
		productList.add(product);
		return productList;
	}

}
