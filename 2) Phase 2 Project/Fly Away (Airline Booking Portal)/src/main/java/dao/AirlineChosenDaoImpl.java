package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dto.AirlinesDetails;
import util.GetConnection;

public class AirlineChosenDaoImpl implements AirlineChosenDao
{
	private Connection connection;
	
	public AirlineChosenDaoImpl() 
	{
		connection = new GetConnection().getConnection();
	}
	

	@Override
	public boolean registerAirlineChosen(AirlinesDetails AirlineDetailsObj) 
	{
		// TODO Auto-generated method stub
		boolean isAirlineRegistered = false;
		String query = "insert into airlineselected values(?)";
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, AirlineDetailsObj.getAirline());			
			int data = preparedStatement.executeUpdate();
			if(data > 0)
				isAirlineRegistered = true;
		} 
		
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return isAirlineRegistered;
	}
	
}
