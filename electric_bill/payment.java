package electric_bill;

import java.util.Scanner;

public class payment {
	int c,ccd,ccv,mmyy;
	String gpay;
	int paymentmethod;
	int reciept;
	public void paymentmethod(int user_id, int billno,float amount2,Scanner s) {
		System.out.println("CREDIT CARD(1),GPAY(2):");
		c=s.nextInt();
		
		switch(c) {
		case 1:
			System.out.println("enter CREDIT CARD NO: ");
			ccd=s.nextInt();
			System.out.println("enter MM/YY(ex.2812): ");
			mmyy=s.nextInt();
			System.out.println("enter CCV NO: ");
			ccv=s.nextInt();
			break;
		
		case 2:
			System.out.println("enter gpay address: ");
			gpay=s.nextLine();
			break;
		}
		System.out.println("------------------");
		System.out.println("USER_ID:------ "+user_id);
		System.out.println("BILL_NO:------ "+billno);
		System.out.println("Amount:------- "+amount2);
		System.out.println("Status:------- Paid");
		System.out.println("Thank you");
		System.out.println("***************************");
		
	}
	

}
