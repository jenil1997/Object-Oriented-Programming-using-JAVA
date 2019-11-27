package Jerex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usrnamepasswrd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";//format for email id
		 Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");//format for password,Pattern is class,pswNamePtrn is object of Pattern class
		 Pattern pattern = Pattern.compile(regex);//Pattern is class,pattern is object of Pattern class
		 System.out.println("Enter email id");
		 String emails=s.next();
		 Matcher match=pattern.matcher(emails);//Matcher is class,emails is variable,mat is object of Matcher class
		 System.out.println("enter the password");
		String password=s.next();
		Matcher mat=pswNamePtrn.matcher(password);//Matcher is class,password is variable,mat is object of Matcher class
		if(match.matches())//matches is result set for Matcher class
		{
			System.out.println("valid email id");
		}
		else
		{
			System.out.println("invalid email id");
		}
		if(mat.matches())
		{
			System.out.println("valid password");
		}
		else
		{
			System.out.println("invalid password");
		}
		
		

	}

}
