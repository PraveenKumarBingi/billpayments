package com.springboot.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class PhonePay implements Payment{

	public PhonePay() {
		System.out.println("PhonePay Constructor Executed");
	}

	@Override
	public String pay() {

		return "Payment done through Phonepay";
	}

}
