package electric_bill;

import java.util.Scanner;

public class customer_care extends database {
	public String query;
	public int custidq;
	public void u_customer_care(Scanner s){ 
		int t = 0;
		int temp = 0;
		System.out.println("Enter the Customer ID :");
		custidq = s.nextInt();
		s.nextLine();
		System.out.println("Enter your query :");
		query= s.nextLine();

		for(int i=0; i<n; i++)
		{
			if (custidq==cust_id[i])
			{
				t++;
				temp = i;
			}
		}
		if(t==0)
		{
			System.out.println("Wrong Customer ID!");
			u_customer_care(s);
		}
		else
		{
			query = queryarr[temp];
			System.out.println("Thank you, we will get back to you soon!");
		}	
	}
	public void a_customer_care() {
		System.out.println("Customer queries:");
		for (int i=0; i<n; i++)
		{
			queryarr[i]="abcdefg";
			System.out.println(i +"  "+ queryarr[i]);
		}
	}
}
