package com.ss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ss.model.Customer;
import com.ss.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomreService {
	
	
	private CustomerRepository custRepo;
	
	public CustomerServiceImpl() {
	}

	
	public CustomerServiceImpl(CustomerRepository custRepo) {
		System.out.println("Constructor injection");
		this.custRepo = custRepo;
	}
	
	@Autowired
	public void setCustRepo(CustomerRepository custRepo) {
		System.out.println("Setter injection");
		this.custRepo = custRepo;
	}

	@Override
	public List<Customer> findAll(){
		return custRepo.findAll();
	}

}
