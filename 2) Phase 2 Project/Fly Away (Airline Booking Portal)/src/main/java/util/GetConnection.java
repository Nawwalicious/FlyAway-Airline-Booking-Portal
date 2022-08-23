package util;

import java.sql.*;

public class GetConnection 
{
	public Connection getConnection() 
	{
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway", 
					"root", 
					"Nawwal2001");
			}
		
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		
		return connection;
	}

}