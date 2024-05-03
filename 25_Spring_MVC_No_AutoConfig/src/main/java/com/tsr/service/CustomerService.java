package com.tsr.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tsr.bo.CustomerBO;
import com.tsr.dao.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Transactional(readOnly = true)
	public List<CustomerBO> getAll() {
		return customerRepository.findAll().stream().map(customer -> {
			CustomerBO bo = new CustomerBO();
			bo.setCustomerNo(customer.getCustomerNo());
			bo.setName(customer.getName());
			bo.setDob(customer.getDob());
			bo.setGender(customer.getGender());
			return bo;
		}).collect(Collectors.toList());
	}
}
