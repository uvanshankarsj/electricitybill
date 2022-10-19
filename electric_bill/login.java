package electric_bill;

import java.util.Scanner;

public class login extends database{
	Scanner s=new Scanner(System.in);
	public login(String role){
		
		int Try=0;
		String username,password;
		len=usernames.length;
		
		if(role=="USER") {
			System.out.println("Enter the username");
			username=s.nextLine();
			for (int i=0;i<5;i++) {
				if (username.equals(usernames[i])){
					System.out.println("Enter the password");
					password=s.nextLine();
					for(int j=0;j<5;j++) {
					if (password.equals(userpasswords[i])) {
						System.out.println("sucessfully loggedin");
						user usa=new user();
						usa.user_(i,s);
					}
					else {
						System.out.println("wrong password");
						Try++;
					}
					if (Try==3) {
						System.out.println("exceeded the try warning message has been sent to the user");
					}
				}
				break;
			}
					
		}
	}
		else {
			System.out.println("Enter the username");
			username=s.nextLine();
			for (int i=0;i<3;i++) {
				if (username.equals(adminname[i])){
					password=s.nextLine();
					for(int j=0;j<3;j++) {
					if (password.equals(adminpasswords[i])) {
						System.out.println("sucessfully loggedin");
						admin a=new admin();
						a.admin_(i,s);
					}
					else {
						System.out.println("wrong password");
						Try++;
					}
					if (Try==3) {
						System.out.println("exceeded the try warning message has been sent to the user");
					}
					}
					break;
				}
				else {System.out.println("abcd");}
					
				}
		}
		
	}
}