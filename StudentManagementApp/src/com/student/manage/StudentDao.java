package com.student.manage;
import java.sql.*;
public class StudentDao {

	public static boolean insertStudentToDB( student st) {
	boolean f =false;
		try {
			Connection con=CP.createC();
			String q="insert into student(sname,sphone,scity) values(?,?,?)";
			//PreparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the value of parameters
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			
			pstmt.executeUpdate();
			f=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int userId) {
		boolean f =false;
		try {
			Connection con=CP.createC();
			String q="delete from student where sid=?";
			//PreparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the value of parameters
			pstmt.setInt(1,userId);
			
			
			pstmt.executeUpdate();
			f=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}

	public static void showAllStudent() {
		
		try {
			Connection con=CP.createC();
			String q="select * from student;";
			//PreparedStatement
			Statement stmt=con.createStatement();
			//set the value of parameters
			
			
			
			ResultSet set=stmt.executeQuery(q);
		while(set.next()) {
			int id = set.getInt(1);
			String name=set.getString(2);
			String phone=set.getString(3);
			String city=set.getString(4);
			
			System.out.println("id"+id);
			System.out.println("name"+name);
			System.out.println("phone"+phone);
			System.out.println("city"+city);
			System.out.println("************************************");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
			
	}
}
