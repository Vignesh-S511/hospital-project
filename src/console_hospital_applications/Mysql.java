package console_hospital_applications;
import java.sql.*;
public class Mysql {
	public static void main(String[] args)
	{
		try {
			String url = "jdbc:mysql://localhost:3306/hospital_management";
			String user = "root";
			String password = "Vignesh@2001";
			String sql = "INSERT INTO userdetails (adminUserName,adminEmail,adminPassword)";
	    	
	    	Connection connection = DriverManager.getConnection(url,user,password);
	    	Statement statement = connection.createStatement();
	    	int result = statement.executeUpdate(sql);
	    	System.out.println("Number of rows Inserted: "+ result);
	    	connection.close();
	    	
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
