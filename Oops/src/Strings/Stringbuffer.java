package Strings;

public class Stringbuffer {

	public static void main(String[] args) {
		//String buffer
		StringBuffer s=new StringBuffer("hello");
		s.append("face");
		System.out.println(s);
		
		//string builder
		StringBuilder b=new StringBuilder("hello ");
		b.append("face");
		System.out.println(b);
		}

}
