package com.paymentservice.service;

import com.paymentservice.pojo.PaymentRequest;
import com.paymentservice.pojo.PaymentResponse;

public interface PaymentService {
	
	PaymentRequest createpayment(PaymentRequest paymentrequest);
	
	PaymentRequest getpaymentdetails(int paymentid);

}
