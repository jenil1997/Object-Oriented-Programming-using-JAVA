package Strings;

import java.util.Scanner;

public class String_buffer {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//string method
		String a="hello";//iteral method
		String a3="hello";
		String a1=new String("face");//object method
		String a2=new String("face");
		a1+="hello";
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a);
		System.out.println(a3);
	}

}
