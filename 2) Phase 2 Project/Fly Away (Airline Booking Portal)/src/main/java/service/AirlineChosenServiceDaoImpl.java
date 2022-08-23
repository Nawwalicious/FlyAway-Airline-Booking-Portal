package service;

import dao.AirlineChosenDao;
import dao.AirlineChosenDaoImpl;
import dao.UserTravelDetailsDao;
import dao.UserTravelDetailsDaoImpl;
import dto.AirlinesDetails;

public class AirlineChosenServiceDaoImpl implements AirlineChosenServiceDao
{
	private AirlineChosenDao dao;
	public AirlineChosenServiceDaoImpl()
	{
		dao = new AirlineChosenDaoImpl();
	}

	
	@Override
	public boolean registerAirlineChosen(AirlinesDetails AirlineDetailsObj) 
	{
		// TODO Auto-generated method stub
		return dao.registerAirlineChosen(AirlineDetailsObj);
	}

}
