package com.motor.bmw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.motor.bmw.entity.Customer;

public interface CustomerRepos extends JpaRepository<Customer, Integer> {

}
