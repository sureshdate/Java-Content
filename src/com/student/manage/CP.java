package com.student.manage;
//connection with mysql
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {
	
	static Connection con; // we make variable of type of connection.
	
	//we have to make static because we have to call direct class.
	public static  Connection createC() throws SQLException {
		try {
			//step1.load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step2:create the connection
			String url="jdbc:mysql://localhost:3306/student_manage?verifyServerCertificate=false&useSSL=true";
			String username="root";
			String password ="GurudevDatta@123";
			
			con= DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
           e.printStackTrace();
		}
		return con;
		
	}

}
