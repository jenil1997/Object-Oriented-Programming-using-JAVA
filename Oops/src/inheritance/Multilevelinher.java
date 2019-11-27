package inheritance;

import java.util.Scanner;

public class Multilevelinher {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Model m=new Model();
		m.brand();
		m.model();
		m.colour();
		

	}

}
class Cars
{
	void brand()
	{
		System.out.println("enter the model");
	}
}
class audi extends Cars
{
	void model()
	{
	System.out.println("audi is available");
	}
}
class Model extends audi
{
	void colour()
	{
		System.out.println("black is available");
	}
}