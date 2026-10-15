package com.motor.bmw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.motor.bmw.entity.Country;
import com.motor.bmw.entity.Customer;
import com.motor.bmw.service.CountryService;
import com.motor.bmw.service.CustomerService;

@RestController
@RequestMapping("/bmw")
public class BMWController {

	@GetMapping("/status")
	public String getStatus() {
		return "Welcome!";
	}

	@Autowired
	CustomerService customerService;

	@PostMapping(value = "/customer", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	public Customer createCustomer(@RequestBody Customer cust) {
		Customer result = customerService.create(cust);
		return result;
	}
	
	@GetMapping(value="/customer",produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Customer> getAllCustomers(){
		return customerService.findAll();
	}
	
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping(value="/country",produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<Country> getAllCountries(){
		return countryService.findAll();
		
	}
	
	@PostMapping(value="/country",produces= {MediaType.APPLICATION_JSON_VALUE},consumes={MediaType.APPLICATION_JSON_VALUE})
	public Country createCountry(@RequestBody Country body){
		return countryService.create(body);
		
	}
}
