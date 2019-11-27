package Strings;

import java.util.Scanner;

public class Casestudy2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("1)Bike");
		System.out.println("2)Car");
		int n=s.nextInt();
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer();
		switch(n)
		{
		case 1:
		System.out.println("Enter the details of Bike");
		System.out.println("Enter the color");
		s1.append(s.next()+"\n");
		System.out.println("Enter the maximum speed");
		s1.append(s.next()+"\n");
		System.out.println("Enter the no. of seats");
		s1.append(s.next()+"\n");
		System.out.println("Enter the no.of wheels");
		s1.append(s.next()+"\n");
		System.out.println("Enter the status of disk brake(true/false)");
		s1.append(s.next()+"\n");
		//v.details(c,sp,st,w,d);
		break;
		case 2:
		   System.out.println("Enter the details of Car");
		System.out.println("Enter the color");
		s2.append(s.next()+"\n");
		System.out.println("Enter the maximum speed");
		s2.append(s.next()+"\n");
		System.out.println("Enter the no. of seats");
		s2.append(s.next()+"\n");
		System.out.println("Enter the no.of wheels");
		s2.append(s.next()+"\n");
		System.out.println("Enter the no.of door");
		s2.append(s.next()+"\n");
		System.out.println("Enter the status of AC(true/false)");
		s2.append(s.next());
		//b.details(c1,sp1,st1,w1,dr,a);
		break;
		}
		System.out.println(s1);
		System.out.println(s2);

		

	}

}
