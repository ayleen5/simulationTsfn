package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Order;
import com.example.beans.Payment;
import com.exapmle.service.PaymentService;

@RestController
public class PaymentController {
	@Autowired
	PaymentService paymentService ;
	
	public String pay (Order order) {
		return paymentService.pay(order);
	}
	
	public String initiateDeposit () {
		return paymentService.initiateDeposit();
	}
	
	public String cancelPay () {
		return paymentService.cancelPay();
	}

}
