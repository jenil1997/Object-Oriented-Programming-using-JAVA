package Strings;

import java.util.Scanner;

public class Stringmethods {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1="face academy";
		String s2="kollam";
		int len=s1.length();//length of string
		char w=s1.charAt(2);//character at index 2
		String e=s1.substring(3,6);//characters from index 3 to index 5
		boolean r=s1.startsWith("face");//check whether string starts with face 
		int t=s1.indexOf("my");//index of character m
		String y=s1.concat(s2);//join two strings
		String u=s2.replace("l","L");//replace the character l in s2 with L
		String[] word=s1.split(" ");//split the words from string s1 
		boolean o=s1.contentEquals(s2);//check whether string s1 and s2 are equal
		System.out.println(len);
		System.out.println(w);
		System.out.println(e);
		System.out.println(r);
		System.out.println(t);
		System.out.println(y);
		System.out.println(u);
		System.out.println(o);
		for(int i=0;i<word.length;i++)
		{
			System.out.println(word[i]);
		}
		

	}

}
