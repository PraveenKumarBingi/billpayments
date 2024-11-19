package com.springboot.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DebitCard implements Payment{

	public DebitCard() {
		System.out.println("DebitCard Constructor Executed");
	}
	@Override
	public String pay() {
		return "Payment done through debitcard";
	}

}
