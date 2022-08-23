package dto;

public class AdminDetails 
{
	private String adminUsername;
	private String adminPassword;
	
	private AdminDetails() {}

	public AdminDetails(String adminUsername, String adminPassword) 
	{
		this.adminUsername = adminUsername;
		this.adminPassword = adminPassword;
	}

	public String getAdminUsername() {
		return adminUsername;
	}

	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "AdminDetails [adminUsername=" + adminUsername + ", adminPassword=" + adminPassword + "]";
	}
	
}
