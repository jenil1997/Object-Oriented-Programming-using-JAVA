package exception;

public class Arrayindex {

	public static void main(String[] args) {
		try
		{
		int a[]= {5,1,2};
		System.out.println(a[7]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
