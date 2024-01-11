package com.example.classic.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="customer_table")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerNumber;
	
	private String userName;
	private String phoneNo;
	private String address;
	private String password;
	
	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	public List<Order> orders;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Payment> payments;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerNumber, String userName, String phoneNo, String address, String password,
			List<Order> orders, List<Payment> payments) {
		super();
		this.customerNumber = customerNumber;
		this.userName = userName;
		this.phoneNo = phoneNo;
		this.address = address;
		this.password = password;
		this.orders = orders;
		this.payments = payments;
	}

	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", userName=" + userName + ", phoneNo=" + phoneNo
				+ ", address=" + address + ", password=" + password + ", orders=" + orders + ", payments=" + payments
				+ "]";
	}
	
	
	}
