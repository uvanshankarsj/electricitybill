package electric_bill;

import java.util.Scanner;

public class register extends database {
	private static int user_id;
	user u=new user();
	int found=0,index,i=0;
	String username1;
	register(String role,Scanner s){
		index=0;
		switch(role) {
		case "USER":
			for (int i=0;i<n;i++) {
				if(usernames[i]==null) {
					index=i;
					break;
				}
			}
			System.out.println("enter your username["+index+"]: ");
            username1=s.nextLine();
			for(i=0;i<n;i++) {
				if(username1.equals(usernames[i])) {
					System.out.println("USERNAME ALREADY EXIST");
					found=1;
				}
			}
			if (found!=1) {
				System.out.println("Enter your password");
					userpasswords[index]=s.nextLine();
					usernames[index]=username1;
					System.out.println("Your cust_id: "+index);
					u.user_(index,s);
					index++;
			}
			break;
			
		case "ADMIN":
			i=0;
			index=0;
			for (int i=0;i<3;i++) {
				if(adminname[i]==null) {
					index=i;
					break;
				}
			}
			System.out.println("enter your username["+index+"]: ");
            username1=s.nextLine();
			for(i=0;i<3;i++) {
				if(username1.equals(adminname[i])) {
					System.out.println("USERNAME ALREADY EXIST");
					found=1;
				}
			}
			if (found!=1) {
				System.out.println("Enter your password");
					adminpasswords[index]=s.nextLine();
					adminname[index]=username1;
					System.out.println("Your admin_id: "+index);
					admin admin=new admin();
					admin.admin_(index,s);
					index++;
			}
			break;
		}
		
   }
}