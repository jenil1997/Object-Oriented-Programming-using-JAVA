package polymorphism;

public class Poly3 {

	public static void main(String[] args) {
		Cg t=new Cg();
		t.disp();
		As w=new As();
		w.disp();

	}

}
class As
{
	void disp()
	{
		System.out.println("parent");
	}
	
}
class Cg extends As
{
	void disp()
	{
		System.out.println("child");
	}
}
