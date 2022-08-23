package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dto.UserContactDetails;
import dto.UserDetails;
import util.GetConnection;

public class UserContactDetailsDaoImpl implements UserContactDetailsDao
{
	private Connection connection;
	
	public UserContactDetailsDaoImpl() 
	{
		connection = new GetConnection().getConnection();
	}

	@Override
	public boolean registerUserContactDetails(UserContactDetails UserContactDetailsObj) 
	{
		// TODO Auto-generated method stub
		boolean isUserContactRegistered = false;
		String query = "insert into usercontactdetails values(?,?,?,?)";
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, UserContactDetailsObj.getPassengerName());
			preparedStatement.setString(2, UserContactDetailsObj.getEmail());
			preparedStatement.setString(3, UserContactDetailsObj.getAddress());
			preparedStatement.setString(4, UserContactDetailsObj.getPhone());
			
			int data = preparedStatement.executeUpdate();
			if(data > 0)
				isUserContactRegistered = true;
		} 
		
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return isUserContactRegistered;
	}
	
	

}
