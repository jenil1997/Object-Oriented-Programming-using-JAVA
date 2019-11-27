package Strings;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String e=s.nextLine();
		String[] word=e.split(" ");
		for(int i=0;i<word.length;i++)
		{
			if(i%2!=0)
			{
				int l=word[i].length();
				for(int j=l-1;j>=0;j--)
				{
					System.out.print(word[i].charAt(j));
				}
				System.out.print(" ");
				
			}
			else
			{
				System.out.print(word[i]+" ");
			}
		}

	}

}