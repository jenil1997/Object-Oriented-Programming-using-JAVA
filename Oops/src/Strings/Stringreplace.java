package Strings;

import java.util.Scanner;

public class Stringreplace {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String vow=s.next();
		String con=s.next();
		String uppr =s.next();
		char[] vow1=vow.toCharArray();
		char[] con1=con.toCharArray();
		char[] uppr1=uppr.toCharArray();
		for(int i=0;i<vow1.length;i++)
		{
			if(vow1[i]=='a'||vow1[i]=='e'||vow1[i]=='i'||vow1[i]=='o'||vow1[i]=='u')
			{
				vow1[i]='$';
			}
			System.out.print(vow1[i]);
		}
		
		for(int i=0;i<con1.length;i++)
		{
			if(con1[i]!='a'&&con1[i]!='e'&&con1[i]!='i'&&con1[i]!='o'&&con1[i]!='u')
			{
				con1[i]='#';
			}
			System.out.print(con1[i]);
		}
		
		for(int i=0;i<uppr1.length;i++)
		{
			if(uppr1[i]>='a'&&uppr1[i]<='z')
			{
				uppr1[i]=(char) (uppr1[i]-(char)32);
			}
			System.out.print(uppr1[i]);
		}
		
		

	}

}
