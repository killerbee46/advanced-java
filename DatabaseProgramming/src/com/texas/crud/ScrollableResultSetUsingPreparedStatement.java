package com.texas.crud;

import java.sql.*;

public class ScrollableResultSetUsingPreparedStatement {
	public static void main(String[] args) throws SQLException {
		Connection con = DBConnect.getDBConnection();
		
		try {
			String sql = "select * from student";
			Statement stm = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			ResultSet res = stm.executeQuery(sql);
			
			res.first();
			System.out.println("Row number: " + res.getRow() + " Name: " + res.getString(2));
			
			res.last();
			System.out.println("Row number: " + res.getRow() + " Name: " + res.getString(2));
			
			res.absolute(3);
			System.out.println("Row number: " + res.getRow() + " Name: " + res.getString(2));
			
			res.relative(-1);
			System.out.println("Row number: " + res.getRow() + " Name: " + res.getString(2));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
