package com.example.classic.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.classic.model.Customer;
import com.example.classic.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

	public List<Payment> getByPaymentDate(Date date);
	
    public List<Payment> getByPaymentDateBetween(Date startDate, Date endDate);

}
