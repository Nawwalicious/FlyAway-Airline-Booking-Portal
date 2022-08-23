package dto;

public class UserContactDetails 
{
	public String PassengerName;
	public String Email;
	public String Address;
	public String Phone;
	
	public UserContactDetails() {}

	public UserContactDetails(String passengerName, String email, String address, String phone) 
	{
		PassengerName = passengerName;
		Email = email;
		Address = address;
		Phone = phone;
	}

	public String getPassengerName() {
		return PassengerName;
	}

	public void setPassengerName(String passengerName) {
		PassengerName = passengerName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	@Override
	public String toString() {
		return "UserContactDetails [PassengerName=" + PassengerName + ", Email=" + Email + ", Address=" + Address
				+ ", Phone=" + Phone + "]";
	}
	
}
