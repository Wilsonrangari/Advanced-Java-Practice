package com.wilson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Registering jdbc driver with driver manager service
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// getting connection object from driverManager
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "wilson", "root");

		if (con != null) {
			System.out.println("Database got connected successfully");
			System.out.println("Connection interface impl class details "+con.getClass().getName());

			// Creating statement obj for passing sql query to db
			Statement st = con.createStatement();

			// String selectquery = "select * from Amgaon";
			String insertQuery = "insert into Amgaon values(2, 'Ruchira')";

			boolean execute = st.execute(insertQuery);
			if (execute) {
				System.out.println("Query got executed successfully");
			} else {
				System.out.println("Check Query");
			}
			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();
			}

		} else {
			System.out.println("Database connection failed");
		}

	}

}
