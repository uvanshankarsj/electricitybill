package electric_bill;

import java.util.Scanner;

public class reading extends database{
    public int custidr;
	public int wattused;
	public void reading_(Scanner s){

		
		int t = 0;
		int temp = 0;
		System.out.println("Enter the Customer ID :");
		custidr = s.nextInt();
		System.out.println("Enter the reading :");
        wattused= s.nextInt();
		for(int i=0; i<n; i++)
		{
			if (custidr==cust_id[i])
			{
				t++;
				temp = i;
			}
		}
		if(t==0)
		{
		System.out.println("Wrong Customer ID!");
		reading_(s);
		}
		else
		{
			wattused = unit[temp];
		}
	}
}	