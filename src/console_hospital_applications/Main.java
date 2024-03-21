package console_hospital_applications;
import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the option");
		
		int option = scanner.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.println("Admin Registration");
			System.out.print("Enter admin userName : ");
			String adminUserName = scanner.nextLine();
			scanner.nextInt();
			System.out.print("Enter admin Email : ");
			String adminEmail = scanner.nextLine();
			scanner.nextInt();
			System.out.print("Enter registration password : ");
			String adminPassword = scanner.nextLine();
			scanner.nextInt();
			Admin admin = new Admin(adminUserName,adminEmail,adminPassword);
			break;
		case 2:
			System.out.println("DOCTOR REGISTRATION");
			System.out.print("Enter doctor userName");
			String doctorUserName = scanner.nextLine();
			scanner.nextInt();
			System.out.print("Enter doctor Email : ");
			String doctorEmail = scanner.nextLine();
			scanner.nextInt();
			System.out.print("Enter registration password : ");
			String doctorPassword = scanner.nextLine();
			scanner.nextInt();
			break;
		case 3:
			System.out.println("patient REGISTRATION");
			System.out.print("Enter patient userName");
			String patientUserName = scanner.nextLine();
			scanner.nextInt();
			System.out.print("Enter patient Email : ");
			String patientEmail = scanner.nextLine();
			scanner.nextInt();
			System.out.print("Enter registration password : ");
			String patientPassword = scanner.nextLine();
			scanner.nextInt();
			break;
		case 4:
			System.out.println("ADMIN LOGIN");
			System.out.println("Enter admin userName");
			String adminLoginUserName = scanner.nextLine();
			scanner.nextInt();
			System.out.println("Enter admin password");
			String adminLoginPassword = scanner.nextLine();
			scanner.nextInt();
			break;
		case 5:
			System.out.println("DOCTOR LOGIN");
			System.out.println("Enter doctor userName");
			String doctorLoginUserName = scanner.nextLine();
			scanner.nextInt();
			System.out.println("Enter admin password");
			String doctorLoginPassword = scanner.nextLine();
			scanner.nextInt();
			break;
		case 6:
			System.out.println("PATIENT LOGIN");
			System.out.println("Enter patient userName");
			String patientLoginUserName = scanner.nextLine();
			scanner.nextInt();
			System.out.println("Enter admin password");
			String patientLoginPassword = scanner.nextLine();
			scanner.nextInt();
			break;
			
			
			
		}
	}
	

}
