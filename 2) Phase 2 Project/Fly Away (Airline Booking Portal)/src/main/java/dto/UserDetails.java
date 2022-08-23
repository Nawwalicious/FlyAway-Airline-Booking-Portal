package dto;

public class UserDetails 
{
	private String Date_Of_Travel;
	private String Source;
	private String Destination;
	private int No_Of_Passenger;
	
	public UserDetails() {}

	public UserDetails(String date_Of_Travel, String source, String destination, int no_Of_Passenger) 
	{
		Date_Of_Travel = date_Of_Travel;
		Source = source;
		Destination = destination;
		No_Of_Passenger = no_Of_Passenger;
	}

	public String getDate_Of_Travel() {
		return Date_Of_Travel;
	}

	public void setDate_Of_Travel(String date_Of_Travel) {
		Date_Of_Travel = date_Of_Travel;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public int getNo_Of_Passenger() {
		return No_Of_Passenger;
	}

	public void setNo_Of_Passenger(int no_Of_Passenger) {
		No_Of_Passenger = no_Of_Passenger;
	}

	@Override
	public String toString() {
		return "UserDetails [Date_Of_Travel=" + Date_Of_Travel + ", Source=" + Source + ", Destination=" + Destination
				+ ", No_Of_Passenger=" + No_Of_Passenger + "]";
	}
	
}