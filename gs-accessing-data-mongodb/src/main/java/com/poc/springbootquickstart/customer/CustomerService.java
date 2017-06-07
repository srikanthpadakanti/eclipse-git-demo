package com.poc.springbootquickstart.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;

	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<>();
		repository.findAll()
		.forEach(customers::add);
		return customers;
	}

	public void addCustomer(Customer customer) {
		repository.save(customer);
	}

	public void updateCustomer(String id, Customer customer) {
		repository.save(customer);
		
	}

	public void deleteCustomer(String id) {
		repository.delete(id);
		
	}

	public Customer getCustomerByFirstName(String firstName) {
		return repository.findByFirstName(firstName);
	}

	public List<Customer> getCustomerByLastName(String lastName) {
		List<Customer> customers = new ArrayList<>();
		repository.findByLastName(lastName)
		.forEach(customers::add);
		return customers;
	}
	
	

}
