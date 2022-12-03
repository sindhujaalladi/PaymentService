package com.paymentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paymentservice.pojo.PaymentRequest;
import com.paymentservice.pojo.PaymentResponse;
import com.paymentservice.service.PaymentService;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	
	@PostMapping("/createPayment")
	public ResponseEntity<PaymentRequest>  createpayment(@RequestBody PaymentRequest paymentRequest){
		PaymentRequest payres  = this.paymentService.createpayment(paymentRequest);
		return new ResponseEntity<>(payres , HttpStatus.CREATED);
		//return payres;
		
	}
	
	@GetMapping("/{paymentid}")
	public ResponseEntity<PaymentRequest> createpayment(@PathVariable int paymentid){
		PaymentRequest payreq  = this.paymentService.getpaymentdetails(paymentid);
		return new ResponseEntity<>(payreq , HttpStatus.CREATED);
		
	}
}
