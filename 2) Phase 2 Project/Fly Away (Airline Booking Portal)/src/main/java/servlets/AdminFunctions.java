package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.AdminDetails;
import service.AdminDetailsServiceDaoImpl;


public class AdminFunctions extends HttpServlet 
{
	private static final long serialVersionUID = 1L;


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
		PrintWriter outPrintWriter = response.getWriter();
		
		String UserName = request.getParameter("uname");
		String PassWord = request.getParameter("pword");
		
		RequestDispatcher rd = null;
		
		
		AdminDetails objAdminDetails = new AdminDetails(UserName, PassWord);
		boolean isAdminvalid = new AdminDetailsServiceDaoImpl().checkAdminDetails(objAdminDetails);		
		
		if (isAdminvalid == true) 
		{
			rd = request.getRequestDispatcher("AdminPrevilidgeFunctions.jsp");
			rd.forward(request, response);
		}
		
		else 
		{
			rd = request.getRequestDispatcher("FailedAdminLogin.jsp");
			rd.forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
