package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		//load the driver class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("driver class loaded");
		
		//obtain the connection 
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro?useSSL=false", "root", "root");
		
		System.out.println("i got the connection from my db");
	
		//create the Statement object
	    Statement statement = connection.createStatement();
	
	    //send the sql queries or process the queries
	    
	    int x = statement.executeUpdate("insert into student values(101,'sanket')");
	    
	    System.out.println(x + "row(s) inserted");
	    
	    //close the connection 
	    connection.close();
	}

}
