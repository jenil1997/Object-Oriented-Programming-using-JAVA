package polymorphism;

import java.util.Scanner;

public class Poly2 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		Students sr=new Students();
	System.out.println("enter the run scored");
	sr.setId(s.nextInt());
	System.out.println("enter the fallen wicket");
	sr.setM2(s.nextInt());
	System.out.println("enter the overs");
	sr.setM1(s.nextInt());
	sr.getdata(sr.getId(),sr.getM1(),sr.getM2());
	sr.add(sr.getId(),sr.getM1());
	sr.add(sr.getM2());
	}

}
class Stu
{
	int id;
	int m1;
	int m2;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public void getdata( int id, int m1, int m2) {
		System.out.println("Total run Scored: "+id);
		System.out.println("Total falled wickets: "+m2);
		System.out.println("Total over: "+m1);
		
		
	}
	
}
class Students extends Stu
{
double t;
	public void add(int Id, int m1) {
		 t=Id/m1;
		 System.out.println("Run rate :"+t);
		
	}

	public void add(int m2) {
		int f=10-m2;
		System.out.println("Wickets remaining :"+f);
	}

	
	
}
