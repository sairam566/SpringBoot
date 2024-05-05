package com.tsr.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsr.dao.CustomerRepository;
import com.tsr.dto.CustomerDto;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public List<CustomerDto> getAllCustomers() {
	return	customerRepository.findAll().stream().map(customer->{
			CustomerDto dto = new CustomerDto();
			dto.setCustomerNo(customer.getCustomerNo());
			dto.setName(customer.getName());
			dto.setDob(customer.getDob());
			dto.setGender(customer.getGender());
			return dto;
		}).collect(Collectors.toList());
	}
}
