package electric_bill;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String role;
		System.out.println("Enter your role:('ADMIN' OR 'USER')");
		do {
			role=s.nextLine();
		}while(role=="USER" || role=="ADMIN");
		int c;
		System.out.println("DO YOU WANT TO LOGIN(1) OR SIGN UP(2): ");
		c=s.nextInt();
		s.nextLine();
        if(c==1) {
        	login l=new login(role);
        }
        if(c==2) {
        	register r=new register(role,s);
        }

	}

}
