package com.example.classic.service;


import java.util.Date;
import java.util.List;

import com.example.classic.model.Payment;

public interface PaymentService {

	public List<Payment> searchByPaymentDate(Date date);
	
	
}
