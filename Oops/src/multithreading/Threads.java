package multithreading;

public class Threads {

	public static void main(String[] args) {
		C t=new C();
		t.start();

	}

}
class C extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				System.out.println("thread going to sleep"+i+"time");
				Thread.sleep(10000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("thread running"+i+"time");
			System.out.println(i);
			
		}
	}
}
