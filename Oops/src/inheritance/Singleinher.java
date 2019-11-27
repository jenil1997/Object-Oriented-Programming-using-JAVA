package inheritance;

import java.util.Scanner;

public class Singleinher {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Toyota d = new Toyota();
		d.about();
		System.out.println("enter model number");
		int n = s.nextInt();
		d.kilo();

	}

}

class Car {
	void about() {
		System.out.println("welcome to toyota world");

	}
}

class Toyota extends Car {
	void kilo() {
		System.out.println("model no is available");
	}
}