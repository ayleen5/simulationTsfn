package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.beans.Payment;

public interface PaymentRepo {
	
	@Query("SELECT p FROM Payment p JOIN p.orders o Where o.id = :order_id ")
	List<Payment> findByOrder(@Param("order_id") int id);

}
