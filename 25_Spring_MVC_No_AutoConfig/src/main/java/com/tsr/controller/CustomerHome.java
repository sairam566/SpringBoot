package com.tsr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tsr.bo.CustomerBO;
import com.tsr.service.CustomerService;

@Controller
public class CustomerHome {

	@Autowired
	private CustomerService service;

	@RequestMapping("/customers.htm")
	public String getAllCustomers(Model model) {
		List<CustomerBO> allCustomers = service.getAll();
		model.addAttribute("allcustomers", allCustomers);
		return "customers";
	}
}
