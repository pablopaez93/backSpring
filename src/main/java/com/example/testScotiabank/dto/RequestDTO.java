package com.example.testScotiabank.dto;

import javax.validation.constraints.NotNull;

public class RequestDTO {

	@NotNull
	private String fullName;
	
	@NotNull
	private String age;
	
	@NotNull
	private String gender;
	
	@NotNull
	private String address;
	
	@NotNull
	private String creditCard;
	
	@NotNull
	private String dueDate;
	
	@NotNull
	private String cvv;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getCVV() {
		return cvv;
	}

	public void setCVV(String cVV) {
		cvv = cVV;
	}

	@Override
	public String toString() {
		return "RequestDTO [fullName=" + fullName + ", age=" + age + ", gender=" + gender + ", address=" + address
				+ ", creditCard=" + creditCard + ", dueDate=" + dueDate + ", CVV=" + cvv + "]";
	}
}
