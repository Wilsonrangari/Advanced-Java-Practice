package com.wilson;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Demo {

	public static void main(String[] args) {

		System.out.println("Hello JDBC");

		oracle.jdbc.driver.OracleDriver ot = new oracle.jdbc.driver.OracleDriver();

		try {
			DriverManager.registerDriver(ot); // Activating JDBC Driver
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
