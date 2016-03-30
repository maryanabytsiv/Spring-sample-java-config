package com.ss.repository;

import java.util.List;

import com.ss.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}