package polymorphism;

import java.util.Scanner;

public class Poly {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		Add1 ad=new Add1();
		ad.add(a);
		ad.add(a,b);
		ad.add(a,b,c);

	}

}
class Add1
{

	public void add(int a) {
		System.out.println(a);
		
	}

	public void add(int a, int b, int c) {
		int s=a+b+c;
		System.out.println(s);
		
	}

	public void add(int a, int b) {
		int s=a+b;
		System.out.println(s);
		
	}
	
}
