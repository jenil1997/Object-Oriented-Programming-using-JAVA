package polymorphism;

import java.util.Scanner;

public class Casepoly1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Cars1 c = new Cars1();
		Bike b = new Bike();
		System.out.println("1.Car\n2.Bike");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Enter the details of car");
			System.out.println("Enter the color");
			c.setColor(s.next());
			System.out.println("Enter the max speed");
			c.setSp(s.nextInt());
			System.out.println("Enter the number of wheels");
			c.setWh(s.nextInt());
			System.out.println("Enter the number of seets");
			c.setSe(s.nextInt());
			System.out.println("Enter the number of doors");
			c.setDr(s.nextInt());
			System.out.println("Enter the Status of Ac");
			c.setAc(s.next());
			c.display();
			break;
		case 2:
			System.out.println("Enter the details of Bike");
			System.out.println("Enter the color");
			b.setColor(s.next());
			System.out.println("Enter the max speed");
			b.setSp(s.nextInt());
			System.out.println("Enter the number of wheels");
			b.setWh(s.nextInt());
			System.out.println("Enter the number of seets");
			b.setSe(s.nextInt());
			System.out.println("Enter the Status of disc");
			b.setDisc(s.next());
			b.display();
			break;
			default:
				System.out.println("invalid");
		}
	}

}
class Vehicle
{
	String color,disc,ac;
	int sp,se,wh,dr;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDisc() {
		return disc;
	}
	public void setDisc(String disc) {
		this.disc = disc;
	}
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public int getSp() {
		return sp;
	}
	public void setSp(int sp) {
		this.sp = sp;
	}
	public int getSe() {
		return se;
	}
	public void setSe(int se) {
		this.se = se;
	}
	public int getWh() {
		return wh;
	}
	public void setWh(int wh) {
		this.wh = wh;
	}
	public int getDr() {
		return dr;
	}
	public void setDr(int dr) {
		this.dr = dr;
	}
}
class Cars1 extends Vehicle
{

	public void display() {
		System.out.println("Car details");
		System.out.println("Color :"+color);
		System.out.println("Max speed :"+sp);
		System.out.println("No of Seats :"+se);
		System.out.println("No of wheels :"+wh);
		System.out.println("No of doors :"+dr);
		System.out.println("Ac Status :"+ac);
		
		
		
		
	}
}
class Bike extends Vehicle
{
	
public void display() {
	System.out.println("Bike details");
	System.out.println("Color :"+color);
	System.out.println("Max speed :"+sp);
	System.out.println("No of Seats :"+se);
	System.out.println("No of wheels :"+wh);
	System.out.println("Disc Status :"+disc);
		
	}
}