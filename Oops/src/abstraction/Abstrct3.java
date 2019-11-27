package abstraction;

import java.util.Scanner;

public class Abstrct3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String as;
		do {
			System.out.println("Registration");
			System.out.println("Enter name");
			String na=s.next();
			System.out.println("enter address");
			String ad=s.next();
			System.out.println("contact number");
			String cn=s.next();
			System.out.println("Email id");
			String e=s.next();
			System.out.println("Proof type");
			String p=s.next();
			System.out.println("proof id");
			String pi=s.next();
			System.out.println("thank you for registering your id is 1");
			System.out.println("do you want to continue registration (y/n)");
			 as=s.next();
		}while(as.equals("yes"));
		System.out.println("do you want to update your email id(y/n)");
		String em=s.next();
		if(em.equals("yes"))
		{
			
		}

	}

}
