package com.motor.bmw.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.motor.bmw.entity.Country;
import com.motor.bmw.repository.CountryRepos;

@Service
public class CountryImpl implements CountryService{

	private CountryRepos countryRepos;
	
	public CountryImpl(CountryRepos repos) {
		this.countryRepos = repos;
	}
	
	@Override
	public Country create(Country body) {			
		return countryRepos.save(body);
	}

	@Override
	public List<Country> findAll() {
		return countryRepos.findAll();
	}

}
