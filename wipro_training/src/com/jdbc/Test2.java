package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro?useSSL=false", "root", "root");
	    PreparedStatement ps = connection.prepareStatement("insert into student values(?,?)");
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter student id:");
	    int stid = scanner.nextInt();
	    System.out.println("Enter student name:");
	    String stname = scanner.next();
	    ps.setInt(1, stid);
	    ps.setString(2, stname);
	    int x =  ps.executeUpdate();
	    System.out.println(x + "row(s) inserted");
	    connection.close();
	    
	}

}
