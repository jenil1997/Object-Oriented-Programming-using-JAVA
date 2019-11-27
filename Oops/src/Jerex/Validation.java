package Jerex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Pattern p=Pattern.compile("...a");
		Matcher m=p.matcher("hava");
		boolean b=m.matches();
		System.out.println(b);
	}

}
