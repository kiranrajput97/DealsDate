package com.capgemini.DealDate.Entity;

import java.math.BigInteger;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Order_Table")
public class Order {
	@Id
	@Column(name="orderId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_seq")
	@SequenceGenerator(sequenceName = "order_sequence", allocationSize = 1, name = "order_seq")

	private Integer orderId;
	
//	@Column(name="orderDispatchDate")
//	private LocalDate orderDispatchDate;
//	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name="orderStatus")
	private String orderStatus;
	
	
	@Column(name="paymentMethod")
	private String paymentMethod;


	public Integer getOrderId() {
		return orderId;
	}


	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}


//	public LocalDate getOrderDispatchDate() {
//		return orderDispatchDate;
//	}


//	public void setOrderDispatchDate(LocalDate orderDispatchDate) {
//		this.orderDispatchDate = orderDispatchDate;
//	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public String getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


	public String getPaymentMethod() {
		return paymentMethod;
	}


	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}


	@Override
	public String toString() {
		return "Order [orderId=" + orderId +  ", quantity=" + quantity
				+ ", orderStatus=" + orderStatus + ", paymentMethod=" + paymentMethod + "]";
	}


	public Order(Integer orderId, LocalDate orderDispatchDate, Integer quantity, String orderStatus,
			String paymentMethod) {
		super();
		this.orderId = orderId;
		//this.orderDispatchDate = orderDispatchDate;
		this.quantity = quantity;
		this.orderStatus = orderStatus;
		this.paymentMethod = paymentMethod;
	}


	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

