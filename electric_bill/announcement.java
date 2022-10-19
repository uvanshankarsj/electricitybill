package electric_bill;

import java.util.Scanner;

public class announcement extends database{

	
	void getannouncement(Scanner s){
		System.out.println("Enter your username");
		String username=s.nextLine();
		for (int i =0;i<n;i++) {
			if (username.equals(adminname[i])){
				System.out.println("Enter your password");
				String password=s.nextLine();

				if (password.equals(adminpasswords[i])) {
					System.out.println("Enter the new announcement");
					announcement[ab]= s.nextLine();
					ab+=1;
				}
			}
		}
		System.out.println("Enter your password");
	}
	void putannouncement(Scanner s) {
		for (int i=0;i<n;i++) {
		System.out.println(announcement[i]+"/n by:"+adminname[i]);
		}
	}
}