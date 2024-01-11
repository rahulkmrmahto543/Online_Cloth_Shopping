package com.example.classic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.classic.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

//	List<Order> findByCustomer_CustomerNumber(int customerNumber);
}
