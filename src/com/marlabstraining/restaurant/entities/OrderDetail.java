package com.marlabstraining.restaurant.entities;

public class OrderDetail {
	private Long orderDetailId;
	private MenuItem menuItem;
	private int orderQuantity;

	public Long getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(Long orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public MenuItem getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public OrderDetail(Long orderDetailId, MenuItem menuItem, int orderQuantity) {
		super();
		this.orderDetailId = orderDetailId;
		this.menuItem = menuItem;
		this.orderQuantity = orderQuantity;
	}

	@Override
	public String toString() {
		return "OrderDetail [menuItem=" + menuItem + ", orderQuantity=" + orderQuantity + "]";
	}

}
