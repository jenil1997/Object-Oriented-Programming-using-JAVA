package multithreading;

public class Threads2 {

	public static void main(String[] args) {
		Car t = new Car();
		Car1 t1 = new Car1();
		Car3 t3 = new Car3();
		t.start();
		t1.start();
		t3.start();

	}

}

class Car extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			if (i == 1)
				yield();
			System.out.println("car A ruuning" + i);
		
		System.out.println("car A running complete");
	}
	}
}

class Car1 extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			if (i == 2)
				stop();
			System.out.println("car B ruuning" + i);
		System.out.println("car B  running complete");
		}
	}
}

class Car3 extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			if (i == 3)
			{
				try {
					System.out.println("car ruuning sleep");
							Thread.sleep(10000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}


