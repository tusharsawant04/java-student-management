package com.student.manage;
import java.sql.Connection;
import java.sql.DriverManager;
public class CP {
	static Connection con;
public static Connection createC() {

	
	try {
		
		//load the driver
	Class.forName("com.mysql.jdbc.Driver");
	//create connection
	String user="root";
	String password="Tushar@4";
	String url="jdbc:mysql://localhost:3306/student_manage";
	
	con=DriverManager.getConnection(url,user,password);
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}
	return con;
}
}
