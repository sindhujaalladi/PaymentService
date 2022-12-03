package com.paymentservice.entity;

import com.paymentservice.pojo.PaymentRequest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Payment")
public class Payment {
	
	
	@Id
	private int paymentid;
	
	@Column(name = "PayeeName")
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
