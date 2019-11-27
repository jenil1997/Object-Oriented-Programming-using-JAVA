package encapsulation;

import java.util.Scanner;

public class Dtails {
	Scanner s=new Scanner(System.in);
	String name,course,college;
	int roll,m,p,c,avg,tot;
	

	public void getdetails() {
		
		System.out.println("Enter your name");
		name=s.next();
		System.out.println("Enter your roll no");
		roll=s.nextInt();
		System.out.println("Enter your course");
		course=s.next();
		System.out.println("Enter your college");
		college=s.next();
		
	}

	public void mark() {
		
		System.out.println("Enter your mark in maths");
		m=s.nextInt();
		System.out.println("Enter your  mark in physics");
		p=s.nextInt();
		System.out.println("Enter your  mark in chemistry");
		c=s.nextInt();
		tot=m+p+c;
		avg=tot/3;
		
	}

	public void display() {
		
		System.out.println("name		:"+name);
		System.out.println("roll no		:"+roll);
		System.out.println("course		:"+course);
		System.out.println("college		:"+college);
		System.out.println("-------------------------");
		System.out.println("marks");
		System.out.println("maths		:"+m);
		System.out.println("physics		:"+p);
		System.out.println("chemistry	:"+c);
		System.out.println("total mark	:"+tot);
		System.out.println("average is	:"+avg);
		
	}

}
