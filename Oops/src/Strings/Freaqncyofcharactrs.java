package Strings;

import java.util.Scanner;

public class Freaqncyofcharactrs {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st=s.next();
		int count;
		for(char c='a';c<='z';c++)
		{
			count=0;
			for(int i=0;i<st.length();i++)
			{
				char q=st.charAt(i);
				if(c==q)
				{
					count++;
				}
			}
			if(count>0)
				System.out.println(c+"\t"+count);
		}

	}

}
