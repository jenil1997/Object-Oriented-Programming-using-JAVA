package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int flag=0;
		System.out.println("enter name");
		String na=s.next();
		System.out.println("enter host");
		String ho=s.next();
		System.out.println("enter string");
		String st=s.next();
		String qw=na.concat(ho);
		char c[]=qw.toCharArray();
		Arrays.sort(c);
		char d[]=st.toCharArray();
		Arrays.sort(d);
		System.out.println(c);
		System.out.println(d);
		if(Arrays.equals(c, d))
		{
			flag=1;
		}
		else
		{
			flag=0;
		}
		if(flag==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		}
		}

