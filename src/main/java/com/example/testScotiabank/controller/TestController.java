package com.example.testScotiabank.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.testScotiabank.dto.RequestDTO;
import com.example.testScotiabank.dto.ResponseDTO;
import com.example.testScotiabank.service.Customerservice;

@CrossOrigin(origins = { "*" })
@RestController
public class TestController {
	
	private final Customerservice customerService;
	
	public TestController(Customerservice customerService) {this.customerService = customerService; }
	
	@PostMapping(value = "/customer", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseDTO postCustomerDetail(
			@Valid @RequestBody RequestDTO requestDTO
			) {
		return customerService.postCustomerDetail(requestDTO);
	}

}
