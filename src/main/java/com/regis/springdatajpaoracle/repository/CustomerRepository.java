package com.regis.springdatajpaoracle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.regis.springdatajpaoracle.customer.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	@Query(value = "select * from CUSTOMERS", nativeQuery = true)
	List<Customer> listarTodosCustomers();
	
}