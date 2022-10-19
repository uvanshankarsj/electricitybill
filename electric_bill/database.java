package electric_bill;

import java.util.Scanner;

public class database {
	database(){
		adminname[0]="sakthi";
		adminpasswords[0]="sakthi";
		adminname[1]="uvan";
		adminpasswords[1]="sakthi";
		usernames[0]="vikkraman";
		userpasswords[0]="vikkraman";
		usernames[1]="shankar";
		userpasswords[1]="shankar";
		
	}

	payment p=new payment();

	
	public int ab;
	public int[] billno=new int[5];
	public int[] admin_id=new int[3];
	public int[] cust_id=new int[5];
	public int[] unit=new int[5];
	
	public String[] usernames=new String[5];
	public String[] adminname=new String[3];
	public String[] userpasswords=new String[5];
	public String[] adminpasswords=new String[3];
	public String[] announcement=new String[5];
	public String[] feedback=new String[5];
	public String[] queryarr=new String[5];
	public int len;
	public float[] tariff=new float[5];
	int temp,n=5;
	float ftemp;
	int billno1,unit1;
	int ct;
	
	public void modifybill(int admin_id, int cust_id1,Scanner s) {
		System.out.println("Enter bill_no: ");
		billno1=s.nextInt();
		System.out.println("Checking bill no.");
		int ct=billnocheck(billno1,admin_id,cust_id1);
		if(ct==1) {
			System.out.println("bill_present and press (1) to confirm modify");
		    ct=s.nextInt();
		    if(ct==1) {
		    	System.out.println("enter the unit to be changed: ");
		        int tunit=s.nextInt();
		        billciddbms(tunit,billno1);
		    }
		    else {modifybill(admin_id,cust_id1,s);}
		    }
		
	}
	public void deletebill(int admin_id, int cust_id1,Scanner s) {
		System.out.println("Enter bill_no: ");
		billno1=s.nextInt();
		System.out.println("Checking bill no.");
		ct=billnocheck(billno1,admin_id,cust_id1);
		if(ct==1) {
			System.out.println("bill_present and press (1) to confirm delete");
		    ct=s.nextInt();
		    if(ct==1) {billdeldbms(billno1,admin_id);}
		    else {modifybill(admin_id,cust_id1,s);}
		}
		else {System.out.println("bill not present");}
	}
	
	public void createbill(int admin_id, int cust_id1, Scanner s) {
	    System.out.println("Checking unit readings...");
	    unit1=unit[cust_id1];
	    if(ct==1) {
	    	System.out.println("CUST_ID FOUND..: "+cust_id1);
	    	System.out.println("BILL CREATED.");
	    	System.out.println("BILL_NO: "+bill_no(cust_id1));
	    }
	    else {System.out.println(cust_id1+" CUST_ID NOT FOUND");}
	}
	
	public void printbill(int user_id,Scanner s) {
		System.out.println("------------------");
		System.out.println("USER_ID:------ "+user_id);
		System.out.println("BILL_NO:------ "+user_id);
		for(ab=0;ab<5;ab++) {
			unit[ab]+=300;
		}
		unit1=unit[user_id];
		float tariff1=currenttariff_values(unit1);
		System.out.println("CurrentTariff: "+tariff1);
		float amount = unit1*tariff1;
		System.out.println("Amount:------- "+amount);
		System.out.println("press (1) to pay (or) (0) to exit: ");
		ct=s.nextInt();

		if(ct==1) {p.paymentmethod(user_id,billno1,amount,s);}
		else if(ct==0) {user user=new user();
			user.user_(user_id,s);}
		else {System.out.println("enter correct value.");
		printbill(user_id,s);}
	}
	
	public float currenttariff_values(float unit) {
		float tar;
		if(unit<500) {
			tar=tariff_values(1);
		}
		else if(unit>=500 && unit<1000) {
			tar=tariff_values(2);
		}
		else if(unit>=1000 && unit<5000) {
			tar=tariff_values(3);
		}
		else {
			tar=tariff_values(4);
		}
		return tar;
	}

	public String[] getUserpasswords() {
		return userpasswords;
	}

	public void setUserpasswords(String[] userpasswords) {
		this.userpasswords = userpasswords;
	}

	public int billnocheck(int billno1, int admin_id2, int cust_id2) {
		len=billno.length;
		for(int i=1;i<len;i++) {
			if(billno1==billno[i]) {
				temp=1;
			}
			else {temp=123;}
		}
		return temp;
	}

	public void billciddbms(int tunit, int billno1) {
		len=billno.length;
		for(int i=0;i<len;i++) {
			if(billno1==billno[i]) {
				unit[i]=tunit;
			}
		}
		
	}

	public void billdeldbms(int billno1, int admin_id1) {
		len=billno.length;
		for(int i=1;i<len;i++) {
			if(billno1==billno[i]) {
				billno[i]=0;
			}
		}
		System.out.println("Bill deleted by admin_id: "+admin_id1);
	}

	public int bill_no(int cust_id1) {
		len=cust_id.length;
		for(int i=1;i<len;i++) {
			if(cust_id[i]==cust_id1) {
				billno[i]=i;
				temp=billno[i];
			}
		}
		return temp;
		
	}

	public float tariff_values(float i) {
		for(int j=1;j<5;j++) {
			tariff[j]=(float) (j*0.5);
		}
		for(int j=1;j<5;j++) {
			if(j==i) {
				ftemp=tariff[j];
			}
		}
		return ftemp;
	}

	public void cust_idcheck(int custidr,Scanner s, reading r) {
		len=cust_id.length;
		for(int i=1;i<len;i++) {
			if(cust_id[i]==custidr) {
				System.out.println("Cust_id"+i+" present.");
			}
			else {
				System.out.println("cust_id"+custidr+" not present.");
				r.reading_(s);
			}
	   }  
   }

	public void wattstorage(int wattused, int custid1) {
		len=unit.length;
		for(int i=0;i<len;i++) {
			if(cust_id[i]==custid1) {
				unit[i]=wattused;
			}
		}
		
	}
	
	
	
}
