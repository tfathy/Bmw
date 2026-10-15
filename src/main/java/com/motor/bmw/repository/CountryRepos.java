package com.motor.bmw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.motor.bmw.entity.Country;

public interface CountryRepos extends JpaRepository<Country, Integer> {

}
