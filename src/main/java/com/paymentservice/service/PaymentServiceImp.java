package com.paymentservice.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentservice.entity.Payment;
import com.paymentservice.pojo.PaymentRequest;
import com.paymentservice.pojo.PaymentResponse;
import com.paymentservice.repository.PaymentRepository;

@Service
public class PaymentServiceImp implements PaymentService{
	
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public PaymentRequest createpayment(PaymentRequest paymentrequest) {
		PaymentResponse payres = new PaymentResponse();
		Payment payobj = Payment.builder().paymentid(paymentrequest.getPaymentid())
				.payeename(paymentrequest.getPayeename())
				.paymentamount(paymentrequest.getPaymentamount())
				.paymentLocation(paymentrequest.getPaymentLocation())
				.isCash(Stringtoboolean(paymentrequest.getIsCash()))
				.Status(paymentrequest.getStatus())
				.ordernum(paymentrequest.getOrdernum())
				.orderdescription(paymentrequest.getOrderdescription())
				.isCheck(Stringtoboolean(paymentrequest.getIsCheck())).build();
		paymentRepository.save(payobj);
		payres.setStatus("payment done successfully");
		payres.setTranscationid(UUID.randomUUID().toString());
		return paymentrequest;
	}

	@Override
	public PaymentRequest getpaymentdetails(int paymentid) {
		Payment payobj = paymentRepository.findBypaymentid(paymentid);
		PaymentRequest payreq = PaymentRequest.builder()
				.paymentid(payobj.getPaymentid())
				.payeename(payobj.getPayeename())
				.paymentamount(payobj.getPaymentamount())
				.paymentLocation(payobj.getPaymentLocation())
				.isCash(String.valueOf(payobj.isCash()))
				.isCheck(String.valueOf(payobj.isCheck()))
				.build();
		return payreq;
	}
	
	
	public static boolean Stringtoboolean(String str) {
		boolean b = Boolean.parseBoolean(str);
		return b;
	}

}
