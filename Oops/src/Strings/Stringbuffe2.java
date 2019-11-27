package Strings;

import java.util.Scanner;

public class Stringbuffe2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		System.out.println("enter the name");
		s.append("name :"+sc.next()+"\n");
		System.out.println("enter the id number");
		s.append("id :"+sc.next());
		System.out.println(s);

	}

}
