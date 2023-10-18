package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
   public static boolean insertStudentToDb(Student st) {
	   boolean f=false;
	   //if u dont want to make static then u can make static to innerclass
	   try {
		Connection con=CP.createC();//connection cretaed
		String q="insert into students(sname,sphone,scity) values(?,?,?)";
		//prepare statement use to fire this query
		PreparedStatement pstmt=con.prepareStatement(q);
		pstmt.setString(1, st.getStudentName());
		pstmt.setString(2, st.getStudentPhone());
		pstmt.setString(3, st.getStudentCity());
		
		//exceute
		pstmt.executeUpdate();
		f=true;
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return f;
   }

public static boolean deleteStudent( int userId) {
	
	  boolean f=false;
	   //if u dont want to make static then u can make static to innerclass
	   try {
		Connection con=CP.createC();//connection cretaed
		String q="delete from students where sid=?";
		//prepare statement use to fire this query
		PreparedStatement pstmt=con.prepareStatement(q);
		pstmt.setInt(1,userId );
		
		
		//exceute
		pstmt.executeUpdate();
		f=true;
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return f;
}

public static void showAllStudent() {
	  boolean f=false;
	   //if u dont want to make static then u can make static to innerclass
	   try {
		Connection con=CP.createC();//connection cretaed
		String q="select * from students";
		//prepare statement use to fire this query
	    Statement smt=con.createStatement();
        ResultSet set =smt.executeQuery(q);
        while(set.next()) {
        	int id =set.getInt(1);
        	String name=set.getString(2);
        	String phone=set.getString(3);
        	String city=set.getString("scity");
        	
        	System.out.println("ID :" +id );
        	System.out.println("Name :" +name );
        	System.out.println("Phone :" +phone );
        	System.out.println("City :" +city );
        	
        	
        }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
//hibernate is a java frmework that simpifies the developement of java application to interact ith database.
//hibernate is a orm tool.object realational mapping
//hibernate is an open source,lightweight.
//hibernate is a non invesive framwork,means it forces the programmers to extend/implementany class/any interface.
//any build application can build with hibernate framwork.hibernate is loosely type coupled.




















