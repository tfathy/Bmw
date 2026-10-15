package com.motor.bmw.service;

import java.util.List;

import com.motor.bmw.entity.Country;

public interface CountryService {
	public Country create(Country body);
	public List<Country> findAll();

}
