package Strings;

import java.util.Scanner;

public class Flames {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first name");
		String s1=s.next();
		System.out.println("enter second name");
		String s2=s.next();
		char c=0;
		char d=0;
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			c=s1.charAt(i);
			for(int j=0;j<s2.length();j++)
			{
				d=s2.charAt(j);
				if(c==d)
				{
					count++;
				}
			}
			
		}
		int f=s1.length()+s2.length()-(count*2);
		System.out.println(f);

	}

}
