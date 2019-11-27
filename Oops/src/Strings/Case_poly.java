package Strings;

import java.util.Scanner;

public class Case_poly {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str="";
		do {
		Bike b = new Bike();
		Car c = new Car();
		StringBuffer x= new StringBuffer();
		StringBuffer y= new StringBuffer();
		System.out.println("1)Car\n2)Bike\n");
		int n=s.nextInt();
		switch(n) {
		case 1:System.out.println("Enter the details of Car");
		System.out.println("Enter the color");
		x.append("color :"+s.next()+"\n");
		System.out.println("Enter the maximum speed");
		x.append("Maximum speed :"+s.next()+"\n");
		System.out.println("Enter the number of seats");
		x.append("Number of seats :"+s.next()+"\n");
		System.out.println("Enter the number of wheels");
		x.append("Number of wheels :"+s.next()+"\n");
		System.out.println("Enter the number of Doors");
		x.append("Number of doors :"+s.next()+"\n");
		System.out.println("Enter the status of AC(true/false)");
		x.append("AC :"+s.next()+"\n");
		   c.displayDetails(x);
		break;
		case 2:System.out.println("Enter the details of Bike");
		System.out.println("Enter the color");
		y.append("color :"+s.next()+"\n");
		System.out.println("Enter the maximum speed");
		y.append("maximum speed :"+s.next()+"\n");
		System.out.println("Enter the number of seats");
		y.append("number of seats :"+s.next()+"\n");
		System.out.println("Enter the number of wheels");
		y.append("number of wheels :"+s.next()+"\n");
		System.out.println("Enter the status of diskbreak(true/false)");
		y.append("disk break :"+s.next()+"\n");
		b.displayDetails(y);
		break;
		case 3:System.out.println("Invalid option");
		break;
		}
		System.out.println("Do you want to continue");
		str=s.next();
		}while(str.equals("yes")==true);



		}

		}
		class Bike extends Carbikepolybuff{

		void displayDetails(StringBuffer x) {
		// TODO Auto-generated method stub
		System.out.println(x);
		}


		}
		class Car extends Carbikepolybuff{

		void displayDetails(StringBuffer y) {
		// TODO Auto-generated method stub
		System.out.println(y);
		}

		}



