package com.texas.crud;

import java.sql.*;

public class DBConnect {
 public static Connection getDBConnection() throws SQLException{
	 Connection con = null;
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/ad_java";
		String user = "root";
		String password = "";
		
		con = DriverManager.getConnection(url, user, password);
		
	 
	 } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return con;
		
 }
}
