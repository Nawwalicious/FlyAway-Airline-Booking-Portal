package service;

import dao.UserContactDetailsDao;
import dao.UserContactDetailsDaoImpl;
import dto.UserContactDetails;
import dto.UserDetails;
import dto.UserContactDetails;

public class UserContactDetailsServiceDaoImpl implements UserContactDetailsServiceDao
{
	private UserContactDetailsDao dao;
	public UserContactDetailsServiceDaoImpl()
	{
		dao = new UserContactDetailsDaoImpl();
	}
	
	@Override
	public boolean registerUserContactDetails(UserContactDetails UserContactDetailsObj) 
	{
		return dao.registerUserContactDetails(UserContactDetailsObj);
	}
}
