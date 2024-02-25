package com.exapmle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beans.Order;
import com.example.beans.Payment;
import com.example.repository.PaymentDAO;

@Service
public class PaymentService {
	@Autowired
	PaymentDAO paymentDao ;
	
	public String pay (Order order) {
		return paymentDao.pay(order);
	}
	
	public String initiateDeposit () {
		return paymentDao.initiateDeposit();
	}
	
	public String cancelPay () {
		return paymentDao.cancelPay();
	}

}
