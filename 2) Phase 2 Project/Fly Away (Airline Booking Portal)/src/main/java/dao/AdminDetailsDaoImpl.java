package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.AdminDetails;
import util.GetConnection;

public class AdminDetailsDaoImpl implements AdminDetailsDao
{

	private Connection connection;
	
	public AdminDetailsDaoImpl() 
	{
		connection = new GetConnection().getConnection();
	}
	
	@Override
	public boolean checkAdminDetails(AdminDetails adminDetailsObj) 
	{
		boolean isAdminValid = false;

		String query = "select * from admindetails where username=? and password=?";
		
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, adminDetailsObj.getAdminUsername());
			preparedStatement.setString(2, adminDetailsObj.getAdminPassword());
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next() == true)
				isAdminValid = true;			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return isAdminValid;
	}

}
