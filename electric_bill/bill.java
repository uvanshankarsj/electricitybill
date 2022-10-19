package electric_bill;

import java.util.Scanner;

public class bill extends database{
	public String paymentstats;
	int ct;
	public int billno,unit1,cust_id1;
	public float currenttariff,amount;
	public void getamount() {
		amount=unit1*currenttariff;
	}
	public void billrole(String role,int tempid,Scanner s) {
		if (role == "ADMIN") {
				System.out.println("Enter cust_id: ");
				cust_id1=s.nextInt();
			System.out.println("CREATE(1),MODIFY(2),DELETE(3): ");
			ct=s.nextInt();
			switch(ct) {
			case 1:
				System.out.println("------------------------------");
				createbill(tempid,cust_id1,s);
				break;
				
			case 2:
				System.out.println("------------------------------");
				modifybill(tempid,cust_id1,s);
				break;
				
			case 3:
				System.out.println("------------------------------");
				deletebill(tempid,cust_id1,s);
				break;
			}
		}
		else if (role =="USER") {
			printbill(tempid,s);
		}
	}
	
}