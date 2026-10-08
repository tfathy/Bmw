package com.motor.bmw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motor.bmw.entity.Customer;
import com.motor.bmw.repository.CustomerRepos;

@Service
public class CustomerImpl implements CustomerService{

	@Autowired
	private CustomerRepos repos;
	
	@Override
	public Customer create(Customer customer) {
		System.out.println(customer);
		return repos.save(customer);
	}

}
