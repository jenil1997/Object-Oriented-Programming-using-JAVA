package encapsulation;

import java.util.Scanner;

public class Garden2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,a,m,g;
		double b;
		String st;
		System.out.println("enter the no of persons");
		n=s.nextInt();
		System.out.println("number of days");
		a=s.nextInt();
		System.out.println("tarf per day");
		b=s.nextInt();
		System.out.println("room type");
		st=s.next();
		System.out.println("month");
		m=s.nextInt();
		if(st.equals("ac"))
		{
			g=250;
		}
		else
		{
			g=150;
		}
		Sub bg=new Sub();
		Ad df=new Ad();
		double d=bg.booker(n,a,b,g);
		switch(m)
		{
		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 9:
		case 10: bg.sub(d);
			break;
		case 4:
		case 5:
		case 6:
		case 11:
		case 12: df.ad(d);
		break;
		}
		

	}

}
class booked
{
	double tot;
	double booker(int n,int a,double b,int g)
	{
		tot=(n*a*b)+g;
		return tot;
	}
}
class Sub extends booked
{
	Scanner s=new Scanner(System.in);
	double t;
	void sub(double d)
	{
		System.out.println("enter the discount");
		int w=s.nextInt();
		double adf=(d*w)/100;
	t=d-adf;
	System.out.println("tariff	:"+t);
	}
}
class Ad extends booked
{
	Scanner s=new Scanner(System.in);
	double t1;
	void ad(double d)
	{
		System.out.println("enter the peak charge");
		int wq=s.nextInt();
		double adfe=(d*wq)/100;
	t1=d+adfe;
		
		System.out.println("tariff	:"+t1);
	}
}