package dto;

public class AirlinesDetails 
{
	public String Airline;
	
	public AirlinesDetails() {}

	public AirlinesDetails(String airline) 
	{
		Airline = airline;
	}

	public String getAirline() 
	{
		return Airline;
	}

	public void setAirline(String airline) 
	{
		Airline = airline;
	}


	@Override
	public String toString() {
		return "AirlinesDetails [Airline=" + Airline + "]";
	}
}
