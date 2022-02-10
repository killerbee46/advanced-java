package com.texas.crud;

import java.sql.*;

public class SelectDemo {
	public SelectDemo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/ad_java";
			String user = "root";
			String password = "";
			String sql = "SELECT * from student";
			
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()){
				
				int id = rs.getInt("ID");
				String firstName = rs.getString(2);
				
				System.out.println("ID: "+id +" Firstname: " + firstName);
			}
			con.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
