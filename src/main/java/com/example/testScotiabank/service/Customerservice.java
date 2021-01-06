package com.example.testScotiabank.service;

import com.example.testScotiabank.dto.RequestDTO;
import com.example.testScotiabank.dto.ResponseDTO;


public interface Customerservice {
	ResponseDTO postCustomerDetail(RequestDTO requestDTO);	
}
