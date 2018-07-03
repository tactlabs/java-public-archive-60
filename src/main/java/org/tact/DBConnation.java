package org.tact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnation {

	public Connection getConnection() throws ClassNotFoundException {
		
		Connection connection = null;
		System.out.println("Connection loaded");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tactmain_dev","root","test");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return connection;
		
	}

}
