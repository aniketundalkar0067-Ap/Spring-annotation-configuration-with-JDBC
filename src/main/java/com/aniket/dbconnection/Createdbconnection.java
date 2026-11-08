package com.aniket.dbconnection;


import java.sql.Connection;
import java.sql.DriverManager;

public class Createdbconnection {

	
static final String url="jdbc:mysql://localhost:3306/emp11";
static final String username="root";
static final String password="root";
	
	
	public static Connection  getconnection()
	{
		Connection connection=null;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		 connection = DriverManager.getConnection(url,username,password);
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
