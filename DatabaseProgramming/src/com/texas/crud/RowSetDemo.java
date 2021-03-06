package com.texas.crud;

import java.sql.*;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {
public static void main(String[] args) {
	
	String url="jdbc:mysql://localhost:3306/ad_java";
	String user = "root";
	String password = "";
	String sql = "select * from student";
	
	try {
		JdbcRowSet jdbcrw = RowSetProvider.newFactory().createJdbcRowSet();
//		JdbcRowSet jdbcrw = RowSetProvider.newFactory().createCachedRowSet();
		jdbcrw.setUrl(url);
		jdbcrw.setUsername(user);
		jdbcrw.setPassword(password);
		jdbcrw.setCommand(sql);
		jdbcrw.execute();
		
		while(jdbcrw.next()){
			String ID = jdbcrw.getString(1);
			String Name = jdbcrw.getString(2);
			System.out.println("Id: "+ ID + " Name: "+ Name);
		}
		
		
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
