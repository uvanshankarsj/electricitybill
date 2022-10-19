package electric_bill;

import java.util.Scanner;

public class user extends database {
	customer_care cc=new customer_care();
	announcement a1=new announcement();
	bill b=new bill();
	public void user_(int i,Scanner s){
	int chc;
	do {
		System.out.println("Enter 1 to pay the bill");
		System.out.println("Enter 2 to use customer care");
		System.out.println("Enter 3 to view announcement");
		System.out.println("Enter 4 to give feedback");
		System.out.println("Enter 5 to EXIT");
		chc=s.nextInt();
	if (chc !=1 && chc !=2 && chc !=3 && chc!=4 && chc!=5) {
		System.out.println("Enter the given choice alone only!");
		System.out.println("");
	    user_(i,s);
	}
	switch (chc) {
	  case 1:
		 b.billrole("USER",i,s);
		  break;
		  
	  case 2:
		  cc.u_customer_care(s);
		  break;
		  
	  case 3:
		  a1.putannouncement(s);
		  break;
		  
	  case 4:
		  feedback a=new feedback("USER",s);
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

