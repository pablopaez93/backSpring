package com.example.testScotiabank.service;

import org.springframework.stereotype.Service;

import com.example.testScotiabank.dto.RequestDTO;
import com.example.testScotiabank.dto.ResponseDTO;

@Service
public class CustomerServiceImpl implements Customerservice{

	@Override
	public ResponseDTO postCustomerDetail(RequestDTO requestDTO) {
		System.out.print(requestDTO.toString());
		ResponseDTO response = new ResponseDTO();
		response.setResultado(requestDTO.toString());
		return response;
	}

}
