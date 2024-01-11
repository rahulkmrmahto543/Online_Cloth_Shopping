package com.example.classic.service;

import java.util.List;
import java.util.Optional;

import com.example.classic.model.Customer;
import com.example.classic.model.Order;

public interface CustomerService {
	
	public String login(String userName,String Password);
	public List<Customer> getCustomer();
	public Customer addCustomer(Customer customer);

}
