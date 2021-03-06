package com.texas.crud;

import java.sql.*;

public class UpdatableDatasetDemo {
	public static void main(String[] args) throws SQLException {
		Connection con = DBConnect.getDBConnection();
		
		try {
			String sql = "select * from student";
			Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			ResultSet res = stm.executeQuery(sql);
			
//			res.first();
//			System.out.println("Row number: " + res.getRow() + " Name: " + res.getString(2));
//			
//			res.last();
//			System.out.println("Row number: " + res.getRow() + " Name: " + res.getString(2));
//			
//			res.absolute(3);
			
			//delete
//			res.deleteRow();
//			System.out.println("Row number: " + res.getRow() + " Name: " + res.getString(2));
//			
//			res.relative(-1);
//			System.out.println("Row number: " + res.getRow() + " Name: " + res.getString(2));
		
			// insert
//			res.moveToInsertRow();
//			res.updateString(2, "Lal Bahadur");
//			res.updateString(3, "Bahadur");
//			res.updateString(4, "Lalu");
//			res.updateString(5, "2022-01-01");
//			res.insertRow();
//				System.out.println("Data Inserted Successfully");
		
			//update
			res.absolute(3);
			res.updateString(2, "new name");
			res.updateString("middleName", "no middle");
			res.updateRow();
			System.out.println("data updated successfully");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
