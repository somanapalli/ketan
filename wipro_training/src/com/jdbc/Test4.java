package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro?useSSL=false", "root", "root");
		connection.setAutoCommit(false);
		Statement statement = connection.createStatement();
		
		int x= statement.executeUpdate("update rama set bal=bal-40000 where accno=1000");
		int y = statement.executeUpdate("update sitha set bal=bal+40000 where accno=1001");
		
		if(x>0 && y>0) {
			connection.commit();
			System.out.println("funds transffered successully, have a great day..");
		}
		
		else
		{
			connection.rollback();
			System.out.println("something went wrong, please check your account number once");
		}
		connection.close();
		
	}
}
