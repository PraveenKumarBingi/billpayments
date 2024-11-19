
package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springboot.dao.Payment;

@Service
public class BillCollector {

	private Payment payment;

	
	public BillCollector() {
		System.out.println("0-param constructor");

	}
	
	@Autowired
	public BillCollector(Payment payment) {
		System.out.println("1-param constructor");
		this.payment = payment;
	}
	
	public void billPay(double amount) {
		String pay = payment.pay();
		System.out.println(pay + ": " + amount );
	}

}
