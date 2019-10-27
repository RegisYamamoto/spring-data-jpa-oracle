package com.regis.springdatajpaoracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regis.springdatajpaoracle.customer.Customer;
import com.regis.springdatajpaoracle.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> listarTodosCustomers() {
		return customerRepository.listarTodosCustomers();
	}
	
}