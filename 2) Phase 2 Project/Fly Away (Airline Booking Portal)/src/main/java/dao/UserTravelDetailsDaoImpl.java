package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dto.UserDetails;
import util.GetConnection;

public class UserTravelDetailsDaoImpl implements UserTravelDetailsDao
{
private Connection connection;
	
	public UserTravelDetailsDaoImpl() 
	{
		connection = new GetConnection().getConnection();
	}
	
	@Override
	public boolean registerUserDetails(UserDetails User) 
	{
		boolean isUserRegistered = false;
		String query = "insert into usertraveldetails values(?,?,?,?)";
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, User.getDate_Of_Travel());
			preparedStatement.setString(2, User.getSource());
			preparedStatement.setString(3, User.getDestination());
			preparedStatement.setInt(4, User.getNo_Of_Passenger());
			
			int data = preparedStatement.executeUpdate();
			if(data > 0)
				isUserRegistered = true;
		} 
		
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return isUserRegistered;
	}
}
