package com.myspringapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myspringapp.entity.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@GetMapping("/getCustomers")
	public List<Customer> getCustomers() {

		List<Customer> customers = new ArrayList<Customer>();

		customers.add(new Customer("Zaur", "Zaurlu"));
		customers.add(new Customer("Yuska", "Yuskali"));
		customers.add(new Customer("Filman", "Toyuqmanli"));

		return customers;
	}

	@GetMapping("/getCustomer/{customerId}")
	public Customer getCustomer(@PathVariable int customerId) {

		List<Customer> customers = new ArrayList<Customer>();

		customers.add(new Customer("Zaur", "Zaurlu"));
		customers.add(new Customer("Yuska", "Yuskali"));
		customers.add(new Customer("Filman", "Toyuqmanli"));

		return customers.get(customerId);
	}

}
