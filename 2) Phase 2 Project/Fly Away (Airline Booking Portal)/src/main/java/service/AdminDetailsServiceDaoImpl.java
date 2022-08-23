package service;

import dao.AdminDetailsDao;
import dao.AdminDetailsDaoImpl;
import dto.AdminDetails;

public class AdminDetailsServiceDaoImpl implements AdminDetailsServiceDao
{
	private AdminDetailsDao dao;
	
	public AdminDetailsServiceDaoImpl() 
	{
		dao = new AdminDetailsDaoImpl();
	}

	@Override
	public boolean checkAdminDetails(AdminDetails adminDetailsObj) 
	{
		// TODO Auto-generated method stub
		return dao.checkAdminDetails(adminDetailsObj);
	}

}
