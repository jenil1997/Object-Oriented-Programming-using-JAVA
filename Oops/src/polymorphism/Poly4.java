package polymorphism;

public class Poly4 {

	public static void main(String[] args) {
		Adf df=new Adf();
		df.disp();

	}

}
class Ghj
{
	void disp()
	{
		System.out.println("parent");
	}
}
class Adf extends Ghj
{
	void disp()
	{
		super.disp();
		System.out.println("child");
	}
}
