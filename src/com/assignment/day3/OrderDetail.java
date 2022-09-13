package com.assignment.day3;

import java.time.LocalDate;

public class OrderDetail {
	private int id;
	private String customerName;
	private int customerId;
	private LocalDate orderDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public OrderDetail(int id, String customerName, int customerId, LocalDate orderDate) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.customerId = customerId;
		this.orderDate = orderDate;
	}
	public OrderDetail() {
		super();
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", customerName=" + customerName + ", customerId=" + customerId
				+ ", orderDate=" + orderDate + "]";
	}	
}
