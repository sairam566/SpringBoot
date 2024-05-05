package com.tsr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tsr.dto.CustomerDto;
import com.tsr.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService service;

	@GetMapping(path = "/customers")
	public String getAllCust(Model model) {

		List<CustomerDto> allCustomers = service.getAllCustomers();
		System.out.println(allCustomers);
		model.addAttribute("allcustomers", allCustomers);
		return "customer";

	}
}
