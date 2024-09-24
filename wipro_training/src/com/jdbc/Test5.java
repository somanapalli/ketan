package com.jdbc;
import java.sql.*;

public class Test5 {

    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/wipro?useSSL=false"; // Replace with your DB details
        String username = "root";  // Replace with your DB username
        String password = "root";  // Replace with your DB password

        Connection connection = null;
        CallableStatement callableStatement = null;
        ResultSet resultSet = null;

        try {
            // 1. Establish the database connection
            connection = DriverManager.getConnection(url, username, password);

            // 2. Prepare the CallableStatement
            String sql = "{CALL getStudentById(?)}"; // The ? represents the input parameter
            callableStatement = connection.prepareCall(sql);

            // 3. Set the input parameter (IN x) - Student ID
            callableStatement.setInt(1, 300);  // Replace '1' with the actual student ID you want to query

            // 4. Execute the stored procedure
            resultSet = callableStatement.executeQuery();

            // 5. Process the result set
            while (resultSet.next()) {
                int studentId = resultSet.getInt("stid");  // Replace "stid" with your actual column name
                String name = resultSet.getString("stname");  // Replace "name" with your actual column name
                

                // Output the student details
                System.out.println("Student ID: " + studentId);
                System.out.println("Name: " + name);
                
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6. Close the resources
            try {
                if (resultSet != null) resultSet.close();
                if (callableStatement != null) callableStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
