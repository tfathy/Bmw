package com.motor.bmw.service;

import java.util.List;

import com.motor.bmw.entity.Customer;

public interface CustomerService {
	public Customer create(Customer customer);
	public List<Customer> findAll();
}
