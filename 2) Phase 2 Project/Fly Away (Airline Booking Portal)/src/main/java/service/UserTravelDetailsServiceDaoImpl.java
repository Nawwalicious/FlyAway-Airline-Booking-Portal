package service;

import dao.UserTravelDetailsDao;
import dao.UserTravelDetailsDaoImpl;
import dto.UserDetails;

public class UserTravelDetailsServiceDaoImpl implements UserTravelDetailsServiceDao
{
	private UserTravelDetailsDao dao;
	public UserTravelDetailsServiceDaoImpl()
	{
		dao = new UserTravelDetailsDaoImpl();
	}
	@Override
	public boolean registerUserDetails(UserDetails UserDetailsObj) 
	{
		// TODO Auto-generated method stub
		return dao.registerUserDetails(UserDetailsObj);
	}
}
