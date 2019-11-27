package exception;

public class Final {

	public static void main(String[] args) {
		try
		{
			String a="abc";
			int b=Integer.parseInt(a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("program closed");
		}

	}

}
