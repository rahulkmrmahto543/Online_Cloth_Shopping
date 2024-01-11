package com.example.classic.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.classic.model.Customer;
import com.example.classic.model.LoginForm;
import com.example.classic.model.Product;
import com.example.classic.service.CustomerService;
import com.example.classic.service.OrderService;
import com.example.classic.service.ProductService;

@Controller
public class UserController {

	@Autowired
	CustomerService customerService;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	OrderService orderService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/cart")
	public String cart() {
		return "cart";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@PostMapping("/registration")
	public String registration(@ModelAttribute Customer customer) {
		System.out.println(customer.toString());
		customerService.addCustomer(customer);
		return "login";
	}
	
//	@GetMapping("/loginuser")
//    public String loginUser(Model model) {
//        model.addAttribute("loginForm", new LoginForm());
//        return "loginuser"; 
//    }
    
    @PostMapping("/loginuser")
    public String processLogin(@ModelAttribute LoginForm loginForm) {
       
        System.out.println("Username: " + loginForm.getUserName());
        System.out.println("Password: " + loginForm.getPassword());

        String customer =  customerService.login(loginForm.getUserName(), loginForm.getPassword());
        System.out.println(customer);
        if("Login".equals(customer)) {
        	return "index";
        }
        return "login"; 
    }
    
  @GetMapping("/products")
  public String allProducts(Model model) {
      model.addAttribute("products",productService.getAllProduct());
      System.out.println(productService.getAllProduct());
      return "index"; 
  }
  
  
  @PostMapping("/addtocart/{id}")
  public String addToCart(@PathVariable int id) {
	  orderService.addToCart(id);
      return "cart";
  }
    
    
}
