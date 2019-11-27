package inheritance;

import java.util.Scanner;

public class Singleinher2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Enfield e=new Enfield();
		e.about();
		System.out.println("enter the required model");
		String st=s.next();
		e.model(st);

	}

}
class Royal
{
	void about()
	{
		System.out.println("enter to the royal world");
		System.out.println("standard 350");
				System.out.println("clasic 350");
						System.out.println("himalayan");
	}
}
class Enfield extends Royal
{
	void model(String gf)
	{
		if(gf.equals("standard"))
		{
			System.out.println("available");
		}
		if(gf.equals("clasic"))
		{
			System.out.println("available");
		}
		if(gf.equals("himalayan"))
		{
			System.out.println("not available");
		}
	}
}
