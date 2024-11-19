package com.springboot.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Upi implements Payment{

	public Upi() {
		System.out.println("upi Constructor Executed");
	}

	@Override
	public String pay() {

		return "Payment done through upi";
	}

}
