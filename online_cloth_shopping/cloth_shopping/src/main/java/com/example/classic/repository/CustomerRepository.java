package com.example.classic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.classic.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	public Customer getByUserName(String userName);
	
}
