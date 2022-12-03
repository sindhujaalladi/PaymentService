package com.paymentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paymentservice.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer>{
	
	Payment findBypaymentid(int paymentid);
	
	

}
