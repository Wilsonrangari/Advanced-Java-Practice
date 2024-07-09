package com.wilson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Registering jdbc driver with driver manager service
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// getting connection object from driverManager
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
		
		if (con != null) {
			System.out.println("Database got connected successfully");
			
		} else {
			System.out.println("Database connection failed");
		}
		
	}

}
