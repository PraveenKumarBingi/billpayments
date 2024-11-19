package com.springboot.dao;

import org.springframework.stereotype.Repository;

@Repository
public class GooglePay implements Payment{

	public GooglePay() {
		System.out.println("GooglePay Constructor Executed");
	}

	@Override
	public String pay() {

		return "Payment done through GooglePay";
	}

}
