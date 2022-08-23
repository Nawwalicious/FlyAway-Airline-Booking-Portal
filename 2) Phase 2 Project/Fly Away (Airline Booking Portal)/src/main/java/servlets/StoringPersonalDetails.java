package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserContactDetailsDaoImpl;
import dto.UserContactDetails;
import util.GetConnection;


public class StoringPersonalDetails extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = null;

		
		String PassengerName = request.getParameter("PassengerName");
		String Email = request.getParameter("Email");
		String Address = request.getParameter("Address");
		String Phone = request.getParameter("Phone");
		
		UserContactDetails usercontactdetailsobj = new UserContactDetails(PassengerName, Email, Address, Phone);
		UserContactDetailsDaoImpl UserContactDetailsDaoImplObj = new UserContactDetailsDaoImpl();
		
		boolean isUserContactRegistered = UserContactDetailsDaoImplObj.registerUserContactDetails(usercontactdetailsobj);
		
		
		rd = request.getRequestDispatcher("DummyPaymentIntermediate.jsp");
		rd.forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
