package com.marlabstraining.restaurant.DAO;

public class DAOFactory {
	private static CustomerDAO customerDAO;
	private static MenuItemDAO menuItemDAO;
	private static OrderDAO orderDAO;

	public static AbstractDAO getDao(String type) {
		switch (type.toLowerCase()) {
		case "customer":
			if (customerDAO != null)
				return customerDAO;
			else {
				return new CustomerDAO();
			}
		case "menuitem":
			if (menuItemDAO != null)
				return menuItemDAO;
			else {
				return new MenuItemDAO();
			}
		case "order":
			if (orderDAO != null)
				return orderDAO;
			else {
				return new OrderDAO();
			}
		default:
			throw new RuntimeException();
		}

	}

}
