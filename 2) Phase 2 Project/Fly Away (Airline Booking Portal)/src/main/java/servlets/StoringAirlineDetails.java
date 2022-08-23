package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AirlineChosenDaoImpl;
import dao.UserTravelDetailsDaoImpl;
import dto.AirlinesDetails;


public class StoringAirlineDetails extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	public String airlineselected;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		PrintWriter outPrintWriter = response.getWriter();
		RequestDispatcher rd = null;

		String AirlineChosen = request.getParameter("airline");
		airlineselected = AirlineChosen;
		
		/******************************************************************************/
		//BillCalculated objBillCalculated = null;
		//objBillCalculated.Airline = AirlineChosen;
		StoringServlet objServlet = new StoringServlet();
		/******************************************************************************/
		
		
		AirlinesDetails AirlinesDetailsObj = new AirlinesDetails(AirlineChosen);
		
		AirlineChosenDaoImpl AirlineChosenDaoImplObj = new AirlineChosenDaoImpl();

		boolean isAirlineRegistered = AirlineChosenDaoImplObj.registerAirlineChosen(AirlinesDetailsObj);		
		
		rd = request.getRequestDispatcher("EnterPersonalDetails.jsp");
		rd.forward(request, response);
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
