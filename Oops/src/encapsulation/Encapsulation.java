package encapsulation;

import java.util.Scanner;

public class Encapsulation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Student1 st=new Student1();
		System.out.println("enter the name");
		st.setName(s.next());
		System.out.println("enter the id");
		st.setId(s.nextInt());
		System.out.println(st.getName());
		System.out.println(st.getId());

	}

}
