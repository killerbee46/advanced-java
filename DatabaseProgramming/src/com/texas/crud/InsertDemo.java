package com.texas.crud;

import java.sql.*;

public class InsertDemo {
public static void main(String[] args) throws SQLException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/ad_java";
		String user = "root";
		String password = "";
		
		String sql = "INSERT into student (firstName,middleName,lastName,Dob) values(?,?,?,?) ";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setString(1, "kan6a1");
		pstm.setString(2, "eh2");
		pstm.setString(3, "kan6a4");
		pstm.setString(4, "2020-03-05");
		
		int res = pstm.executeUpdate();
		if (res > 0) {
			System.out.println("data inserted successfully");
		}
		
		con.close();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
