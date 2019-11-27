package encapsulation;

import java.util.Scanner;

public class Garden {

	public static void main(String[] args) {
		
		
		Rent r=new Rent();
		r.getdetails();
		r.total();
		

	}

}
class Details
{
	Scanner s=new Scanner(System.in);
	int n,a,b;
	String st;
	void getdetails()
	{
		System.out.println("enter the no of persons");
		n=s.nextInt();
		System.out.println("enter the no of days");
		a=s.nextInt();
		System.out.println("enter the tariff per day");
		b=s.nextInt();
		System.out.println("enter the room type");
		st=s.next();
	}
}
class Rent extends Details
{
	double total()
	{
		
		double tot=a*b*n;
		System.out.println("tariff	:"+tot);
		return tot;
	}
	
}
