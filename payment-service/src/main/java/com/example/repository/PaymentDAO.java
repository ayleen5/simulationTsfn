package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.beans.Order;
import com.example.beans.Payment;
import com.example.repository.PaymentRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PaymentDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public String pay (Order order) {
		entityManager.persist(order);
		return "payment is done"; //i know that is not correct, I'm sorry :(
		
	}
	
	public String initiateDeposit() {
		
	}
	
	public Optional<Payment> getPayment(int id)
	{
		return Optional.ofNullable(entityManager.find(Payment.class,id));
	}
	
	public String cancelPay(Payment payment) {
		int id = payment.getId();
		getPayment(id).ifPresent(payment -> entityManager.remove(payment));
		return "Payment is cancelled";
	}
	
	public String successPay (String paymentId, String payerId) {
		
	}
	public List<Payment> getPaymentByOrder (Order order){
		return paymentRepo.findByByOrder(order);
	}
	public Optional<Order> getAllOrdersByPriceLessThan (double price){
		
	}
	public List<Payment> getAllPaymentsByPaymentMethod (String method){
		
	}


}
