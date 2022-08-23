package servlets;

import java.io.IOException;
import util.*;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserTravelDetailsDaoImpl;
import dto.UserDetails;


public class StoringServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	public int NumPassengers;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		RequestDispatcher rd = null;
		
		PrintWriter outPrintWriter = response.getWriter();
		
		String DOT = request.getParameter("Date_Of_Travel");
		String Source = request.getParameter("source");
		String Destination = request.getParameter("Destination");
		String NOP = request.getParameter("No_Passengers");
		int No_Passengers = Integer.parseInt(NOP);
		NumPassengers = No_Passengers;
		
		/******************************************************************************/
		//BillCalculated objBillCalculated = null;
		//objBillCalculated.num_passengers = No_Passengers;
		/******************************************************************************/

		UserDetails User = new UserDetails(DOT, Source, Destination, No_Passengers);
		UserTravelDetailsDaoImpl objUserTravelDetailsDAOimpl = new UserTravelDetailsDaoImpl();
		
		
		boolean isUserRegistered = objUserTravelDetailsDAOimpl.registerUserDetails(User);
		
		rd = request.getRequestDispatcher("AirlineSelection.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
