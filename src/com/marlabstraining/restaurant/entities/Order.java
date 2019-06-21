package com.marlabstraining.restaurant.entities;

import java.util.Arrays;
import java.util.List;

public class Order {
	private Long id;
	private String status;
	private List<OrderDetail> orderDetails;
	private Customer customer;

	public Order() {

	}

	public Order(Long id, String status, List<OrderDetail> orderDetails, Customer customer) {
		super();
		this.id = id;
		this.status = status;
		this.orderDetails = orderDetails;
		this.customer = customer;
	}

	@Override
	public String toString() {

		return "Order [id=" + id + ", status=" + status + ", orderDetails=" + Arrays.toString(orderDetails.toArray())
				+ ", customer=" + customer + "]";
	}

}
