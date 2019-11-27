package multithreading;

import java.util.Scanner;

public class Threads3example {

	public static void main(String[] args) {
		New n=new New();
		n.start();

	}
}
	class New extends Thread{
		public void run() {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			System.out.println("bomb will blast in");
			for(int i=n;i>=0;i--)
			{
				
				try {
					System.out.println(i+" s");
					Thread.sleep(1000);
				}
				catch(Exception e) {
					System.out.println(e);
					
				}
			}
			System.out.println("booom!!!");
			
			
		}
	}


