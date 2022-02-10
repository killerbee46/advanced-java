package com.texas.crud;

import java.sql.*;

public class DeleteDemo {
public static void main(String[] args) throws SQLException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String url="jdbc:mysql://localhost:3306/ad_java";
	String user = "root";
	String password = "";
	
	String sql = "delete from student where ID = ?; ";
	
	Connection con = DriverManager.getConnection(url, user, password);
	
	PreparedStatement pstm = con.prepareStatement(sql);
	pstm.setInt(1, 3);
	int res = pstm.executeUpdate();
//	boolean res = pstm.execute();
	
	if (res > 0) {
		System.out.println("data deleted succesfully");
		
	}
	
	con.close();
	
}
}
