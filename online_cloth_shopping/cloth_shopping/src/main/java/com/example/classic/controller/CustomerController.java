package com.example.classic.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.classic.exception.CustomerNotFoundException;
import com.example.classic.model.Customer;
import com.example.classic.model.Order;
import com.example.classic.service.CustomerService;


@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

//    *********************************************************************************
//    http://localhost:8082/api/v1/customer
    @GetMapping("/customer")
    public ResponseEntity<List<Customer>> getAllCustomer() {
        try {
            List<Customer> customers = customerService.getCustomer();
            return new ResponseEntity<>(customers, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    
    @PostMapping("/addcustomer")
    public Customer addCustomer(Customer cust) {
    	return customerService.addCustomer(cust);
    }
    
  
   
}
