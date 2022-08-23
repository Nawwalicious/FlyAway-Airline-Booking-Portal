package AdminServices;

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


public class PrintAirlineDetails extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		out.println("The Stored Passenger Details Are:-");
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/flyaway", 
					"root", 
					"Nawwal2001");
			
			String query = "select * from airlinefare";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			ResultSet resultSet = preparedStatement.executeQuery(query);
			
			out.println("<table border='2'>");
			
			while(resultSet.next()) 
			{
				String airline = resultSet.getString(1);
				int fare = resultSet.getInt(2);
				
				out.println("<tr><td>Airlines In Service : " + airline);
				out.println("<tr><td>Fare : " + fare);
				out.println("<tr><td>");				
			}
			
		} 
		
		catch (ClassNotFoundException | SQLException e) 
		{
			// TODO Auto-generated catch block
			((Throwable) e).printStackTrace();
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
