package com.marlabstraining.restaurant.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public abstract class AbstractDAO {

	public AbstractDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/restaurant?characterEncoding=UTF-8", "root",
				"450179");
	}

	abstract public void addOne(Object o);

	abstract public void deleteOne(Object o);

	abstract public Object getOne(Long id);

	abstract public List<Object> getAll();

	abstract public void updateOne(Object o);
}
