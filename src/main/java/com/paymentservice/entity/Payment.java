package com.paymentservice.entity;

import com.paymentservice.pojo.PaymentRequest;

import javax.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Entity;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@javax.persistence.Entity
@javax.persistence.Table(name = "Payment")
public class Payment {
	
	
	@Id
	private int paymentid;
	
	@javax.persistence.Column(name = "PayeeName")
	private String payeename;
	
	@Column(name = "PayementAmount")
	private double paymentamount;
	
	@Column(name = "PaymentLocation")
	private String paymentLocation;
	
	@Column(name = "IsCheck")
	private boolean isCheck;
	
	@Column(name = "IsCash")
	private boolean isCash;
	
	@Column(name = "OrderNum")
	private int ordernum;
	
	@Column(name = "OrderDescription")
	private String orderdescription;	
	
	@Column(name = "Status")
	private String Status;

}
