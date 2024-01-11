package com.example.classic.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.classic.exception.CustomerNotFoundException;
import com.example.classic.exception.CustomerUpdateException;
import com.example.classic.model.Customer;
import com.example.classic.model.Order;
import com.example.classic.repository.CustomerRepository;
import com.example.classic.repository.OrderRepository;
import com.example.classic.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepo;
    
//  *****************************************************************
//    To get all Customer
    @Override
    public List<Customer> getCustomer() {
        return customerRepo.findAll();
    }

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	public String login(String userName, String password) {
		Customer cust = customerRepo.getByUserName(userName);
		
		System.out.println(cust);
		
		if(cust == null) {
			return "Customer Not Found";
		}
		if(cust !=null && cust.getUserName().equals(userName) && cust.getPassword().equals(password)) {
			return "Login";
		}
		return null;
	}
    

    
}
