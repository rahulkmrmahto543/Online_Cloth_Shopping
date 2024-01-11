package com.example.classic.serviceImpl;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.classic.exception.PaymentServiceException;
import com.example.classic.model.Customer;
import com.example.classic.model.Payment;
import com.example.classic.repository.CustomerRepository;
import com.example.classic.repository.PaymentRepository;
import com.example.classic.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepository paymentRepo;

    @Autowired
    CustomerRepository customerRepo;

//  *****************************************************************
//  To get all payment by date
    @Override
    public List<Payment> searchByPaymentDate(Date date) {
        // TODO Auto-generated method stub
        return paymentRepo.getByPaymentDate(date);
    }
}