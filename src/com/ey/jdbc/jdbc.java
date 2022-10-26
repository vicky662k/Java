package com.ey.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement st = con.createStatement();
		//insert-update execute , select executeQuery
		
		ResultSet rs=st.executeQuery("select * from test.employee;");
		while(rs.next()) {
			System.out.println(rs.getInt("emp_id")+"\t"+rs.getString("employee_name")+"\t"+rs.getInt("age")+"\t"+rs.getString("gender"));
		}
		
		
	}

}
