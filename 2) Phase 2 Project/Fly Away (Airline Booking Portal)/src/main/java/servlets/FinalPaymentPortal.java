package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FinalPaymentPortal extends HttpServlet 
{
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("Your Payment Was Successful");
		out.println("Your Travel Details Are As Follows:-");

		//The Following Is Responsible For Displaying User's Travel Details.......
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/flyaway", 
					"root", 
					"Nawwal2001");
			
			String query = "select * from airlineselected";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			ResultSet resultSet = preparedStatement.executeQuery(query);
			
			out.println("<table border='1'>");
			
			while(resultSet.next()) 
			{
				String airlineselected = resultSet.getString(1);
				
				out.println("<tr><td>Airline Selected : " + airlineselected);
				out.println("<tr><td>");				
			}
			
		} 
		
		catch (ClassNotFoundException | SQLException e) 
		{
			// TODO Auto-generated catch block
			((Throwable) e).printStackTrace();
		}
		

		//Printing of user travel details is over here...
		
		//Printing of user airline details is over here...
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/flyaway", 
					"root", 
					"Nawwal2001");
			
			String query = "select * from usertraveldetails";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			ResultSet resultSet = preparedStatement.executeQuery(query);
			
			out.println("<table border='4'>");
			
			while(resultSet.next()) 
			{
				String dateoftravel = resultSet.getString(1);
				String source = resultSet.getString(2);
				String destination = resultSet.getString(3);
				int numberofpassengers = resultSet.getInt(4);
				
				out.println("<tr><td>Date : " + dateoftravel);
				out.println("<tr><td>Source : " + source);
				out.println("<tr><td>Destination : " + destination);
				out.println("<tr><td>Number Of Passengers : " + numberofpassengers);
				out.println("<tr><td>");				
			}
			
		} 
		
		catch (ClassNotFoundException | SQLException e) 
		{
			// TODO Auto-generated catch block
			((Throwable) e).printStackTrace();
		}
		
		//Printing of user travel details is over here...
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
