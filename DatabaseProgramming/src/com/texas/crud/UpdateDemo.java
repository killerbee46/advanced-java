package com.texas.crud;

import java.sql.*;

import jdk.nashorn.internal.ir.SetSplitState;

public class UpdateDemo {
public static void main(String[] args) throws SQLException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/ad_java";
		String user = "root";
		String password = "";
		
		String sql = "UPDATE student set firstName=? , middleName = ?, lastName = ? , Dob = ? where ID = ?; ";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setString(1, "La");
		pstm.setString(2, "La");
		pstm.setString(3, "Land");
		pstm.setString(4, "2021-12-21");
		pstm.setInt(5, 4);
		
		int res = pstm.executeUpdate();
		
		if (res > 0) {
			System.out.println("data updated succesfully");
			
		}
		
		con.close();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
