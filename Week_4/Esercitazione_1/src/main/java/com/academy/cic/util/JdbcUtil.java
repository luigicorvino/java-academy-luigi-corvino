package com.academy.cic.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtil {
	
	private static Connection connection;
	
	static{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException e) {
			System.out.println("Driver class not found");
		}
	}
	
	public static Connection getConnection() throws SQLException {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "javauser", "root");
		return connection;
	}
	
	public static void closeConnection(Connection conn) throws SQLException {
		if (conn != null)
			conn.close();
	}
	
	public static void closePreparedStatement(PreparedStatement st) throws SQLException {
		if (st != null) 
			st.close();
	}
	
	public static void closeResultSet(ResultSet rs) throws SQLException {
		if (rs != null)
			rs.close();
	}

}