package Strings;

import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String key="qwertyuiopasdfghjkl;'zxcvbnm,./";
		int i,j;
		System.out.println("enter the character");
		char c=s.next().charAt(0);
		System.out.println("enter the string");
		String str=s.next();
		for(i=0;i<str.length();i++)
		{
			for(j=0;j<key.length();j++)
			{
				if(str.charAt(i)==key.charAt(j)&&c=='R')
				{
					System.out.print(key.charAt(j-1));
				}
				if(str.charAt(i)==key.charAt(j)&&c=='L')
				{
					System.out.print(key.charAt(j+1));
				}
			}
		}

	}

}
