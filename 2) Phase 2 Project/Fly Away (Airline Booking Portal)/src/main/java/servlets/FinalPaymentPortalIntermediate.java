package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FinalPaymentPortalIntermediate extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    public int finalfare;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		StoringServlet objServlet = new StoringServlet();
		int numofp = objServlet.NumPassengers;
		
		StoringAirlineDetails objAirlineDetails = new StoringAirlineDetails();
		String airlineString = objAirlineDetails.airlineselected;
		
		
		int fare=numofp;
		
		if (airlineString == "Indigo") 
		{
			fare*= 7000;
		} 
		else if (airlineString == "Spice Jet")
		{
			fare*= 7500;
		}
		else if (airlineString == "Air India")
		{
			fare*= 7850;
		}
		else if (airlineString == "Vistara")
		{
			fare*= 9500;
		}
		else if (airlineString == "Emirates")
		{
			fare*= 17500;
		}
		else if (airlineString == "Cathay Pacific")
		{
			fare*= 14500;
		}
		else if (airlineString == "Turkish Airline")
		{
			fare*= 14500;
		}
		else if (airlineString == "Qantas")
		{
			fare*= 17000;
		}
		else if (airlineString == "Qatar Airways")
		{
			fare*= 20000;
		}
		
		PrintWriter outPrintWriter = response.getWriter();
		outPrintWriter.println("The fare for your flight is:"+fare);
		outPrintWriter.println("Please proceed to complete the payment");
		
		RequestDispatcher rd = null;

		rd = request.getRequestDispatcher("DummyPayment.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
