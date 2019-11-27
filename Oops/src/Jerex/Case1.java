package Jerex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Case1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Pattern name=Pattern.compile( "[A-Z][a-z]*");
		Pattern lname=Pattern.compile("[A-Z][a-z]*");
		Pattern email=Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
		Pattern reg=Pattern.compile("^[0-9]*");
		Pattern rank=Pattern.compile("^[0-9]*");
		Pattern year=Pattern.compile("^[0-9]*");
		Pattern dep=Pattern.compile("[A-Z]*.[A-Z]*");
		System.out.println("enter the name");
		String name1=s.next();
		Matcher match=name.matcher(name1);
		System.out.println("enter the last name");
		String lname1=s.next();
		Matcher match6=lname.matcher(lname1);
		System.out.println("enter the emailid");
		String email1=s.next();
		Matcher match1=email.matcher(email1);
		System.out.println("enter the reg.no");
		String reg1=s.next();
		Matcher match2=reg.matcher(reg1);
		System.out.println("enter the rank");
		String rank1=s.next();
		Matcher match3=rank.matcher(rank1);
		System.out.println("enter the year");
		String year1=s.next();
		Matcher match4=year.matcher(year1);
		System.out.println("enter the department");
		String dep1=s.next();
		Matcher match5=dep.matcher(dep1);
		Pattern psw = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
		
		if(match.matches()==false)//matches is result set for Matcher class
		{
			System.out.println("name invalid");
		}
		 if(match6.matches()==false)
		{
			System.out.println("last name invalid");
		}
		 if(match1.matches()==false)
		{
			System.out.println("email invalid");
		}
		if(match2.matches()==false)
		{
			System.out.println("reg invalid");
		}
		if(match3.matches()==false)
		{
			System.out.println("rank invalid");
		}
		if(match4.matches()==false)
		{
			System.out.println("year invalid");
		}
		if(match5.matches()==false)
		{
			System.out.println("dep invalid");
		}
		if(match.matches()&&match1.matches()&&match2.matches()&&match3.matches()&&match4.matches()&&match5.matches()&&match6.matches())
		{
			System.out.println("enter the password");
			String password=s.next();
			Matcher match7=psw.matcher(password);
			Matcher match8=email.matcher(email1);
			if(match8.matches())//matches is result set for Matcher class
			{
				System.out.println("valid user name");
			}
			else
			{
				System.out.println("invalid user name");
			}
			if(match7.matches())
			{
				System.out.println("valid password");
			}
			else
			{
				System.out.println("invalid password");
			}
			
		}

	}

}
