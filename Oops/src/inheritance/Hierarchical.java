package inheritance;

public class Hierarchical {

	public static void main(String[] args) {
		Cricket c=new Cricket();
		Test d=new Test();
		c.odi();
		d.test();
		c.game();

	}

}
class Oneday
{
	void odi()
	{
		System.out.println("it is 50 over match");
	}
}
class Test extends Oneday
{
	void test()
	{
		System.out.println("it is 5 day match");
	}
} 
class Cricket extends Oneday
{
	void game()
	{
		System.out.println("cricket is played by 11 men.it has 3 formats");
	}
}
