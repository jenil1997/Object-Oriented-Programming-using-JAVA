package Strings;

import java.util.Scanner;

public class Findvowels_etc {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String e=s.nextLine();
		char c=' ';
		int lower=0,upper=0,space=0,dig=0,vow=0,spcl=0,chara=0;
		for(int i=0;i<e.length();i++)
		{
			c=e.charAt(i);
			if(c>='A'&&c<='Z')
			{
				upper++;
			}
			if(c>='a'&&c<='z')
			{
				lower++;
			}
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				vow++;
			}
			else if(c>='0'&&c<='9')
			{
				dig++;
			}
			else if(c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*'||c=='('||c==')')
			{
				spcl++;
			}
			else if(c==' ')
			{
				space++;
			}
			else 
			{
				chara++;
			}
		}
		System.out.println("vowels :"+vow);
		System.out.println("digits :"+dig);
		System.out.println("special characters :"+spcl);
		System.out.println("space :"+space);
		System.out.println("characters :"+chara);
		System.out.println("uppercase :"+upper);
		System.out.println("lowercase :"+lower);
	}
}