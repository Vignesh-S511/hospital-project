package console_hospital_applications;

import java.util.regex.Pattern;

public class Admin {
	
	private String adminUserName;
	private String adminEmail;
	private String adminPassword;
	
	
	public String getAdminUserName() 
	{
		return adminUserName;
	}
	public void setAdminUserName(String adminUserName)
	{
		this.adminUserName = adminUserName;
	}
	public String getAdminEmail() 
	{
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) 
	{
		this.adminEmail = adminEmail;
	}
	public String getAdminPassword() 
	{
		
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) 
	{
		String regexPassword = "^[A-Z]+[a-z]+[0-9]+[@%$]+{8,20}";
		if(Pattern.matches(regexPassword, adminPassword))
		{
		    this.adminPassword = adminPassword;
		}
		else
		{
			System.out.println("YOUR PASSWORD IS WEEK");
		}
	}
	
	
	public Admin(String adminUserName, String adminEmail, String adminPassword) 
	{
		
		this.setAdminUserName( adminUserName);
		this.setAdminEmail(adminEmail);
		this.setAdminPassword(adminPassword);
	}
	
	
	
	
	

}
