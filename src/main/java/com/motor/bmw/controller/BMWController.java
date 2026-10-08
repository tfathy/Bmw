package com.motor.bmw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.motor.bmw.entity.Customer;
import com.motor.bmw.service.CustomerService;

@RestController
@RequestMapping("/bmw")
public class BMWController {

	@GetMapping("/status")
	public String getStatus() {
		return "Welcome!";
	}

	@Autowired
	CustomerService service;

	@PostMapping(value = "/customer", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	public Customer createCustomer(@RequestBody Customer cust) {
		Customer result = service.create(cust);
		return result;
	}
}
