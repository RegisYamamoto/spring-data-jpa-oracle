package com.regis.springdatajpaoracle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regis.springdatajpaoracle.customer.Customer;
import com.regis.springdatajpaoracle.service.CustomerService;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@GetMapping(value = "")
	public List<Customer> listarTodosCustomers() {
		return customerService.listarTodosCustomers();
	}
	
}