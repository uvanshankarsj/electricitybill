package electric_bill;

import java.util.Scanner;

public class feedback extends database{
	int n=1;
	feedback(String role,Scanner s){
		
		if(role=="USER") {
			String username;
			System.out.println("enter the admin name ");
			username =s.nextLine();

			for (int i=0;i<n;i++) {
			if (username.equals(usernames[i])){
				System.out.println("enter the feed back");
				feedback[i]=s.nextLine();
			}
			}
		}
		else {
			String adminnames;
			System.out.println("enter the admin name ");
			adminnames =s.nextLine();

			for (int i=0;i<n;i++) {
			if (adminnames.equals(adminname[i])){
				System.out.println(feedback[i]);
			}
			}
		}
	}
}