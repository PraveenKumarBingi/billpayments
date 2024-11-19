
package com.springboot.dao;


import org.springframework.stereotype.Repository;

@Repository
public class CreditCard implements Payment {

	public CreditCard() {
		System.out.println("CreditCard Constructor Executed");
	}

	@Override
	public String pay() {

		return "Payment done through creditcard";
	}

}
