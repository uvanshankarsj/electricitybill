package electric_bill;

import java.util.Scanner;

public class admin extends database {

		public void admin_(int i,Scanner s){
			
		int chc;
		
		do {
			System.out.println("Enter 1 to open bill portal");
			System.out.println("Enter 2 to view customer care");
			System.out.println("Enter 3 to edit announcement");
			System.out.println("Enter 4 to view feedback");
			System.out.println("Enter 5 to EXIT");
			chc=s.nextInt();
		if (chc !=1 && chc !=2 && chc !=3 && chc!=4 && chc!=5) {
			System.out.println("Enter the given choice alone only!");
			System.out.println("");
		    admin_(i,s);
		}
		switch (chc) {
		  case 1:
			  bill abd=new bill();
			  abd.billrole("ADMIN",i,s);
			  break;
			  
		  case 2:
			  customer_care cca=new customer_care();
			  cca.a_customer_care();
			  break;
			  
		  case 3:
			  announcement a12=new announcement();
			  a12.getannouncement(s);
			  break;
			  
		  case 4:
			  feedback a=new feedback("ADMIN",s);
			  break;
			  
		  case 5:
			  s.close();
			  System.out.println("SYSTEM TERMINATED...");
			  System.exit(0);
			  break;
		}
		}while(chc!=5);


		
	}

	}


