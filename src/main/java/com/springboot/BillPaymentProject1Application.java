package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.service.BillCollector;


@SpringBootApplication
public class BillPaymentProject1Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(BillPaymentProject1Application.class, args);
	BillCollector res = context.getBean(BillCollector.class);	
	res.billPay(25000);
	}
	
}
