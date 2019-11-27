package Datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int persons, room;
		String type;
		String name;
		String address;
		long total;
		do {
			System.out.println("registration");
			System.out.println("enter the name");
			name = s.next();
			System.out.println("enter the address");

			address = s.next();
			System.out.println("enter no of rooms");
			room = s.nextInt();
			System.out.println("enter the no of persons");
			persons = s.nextInt();
			System.out.println("ac or not");
			type = s.next();
			System.out.println("Booking date ");
			String start = s.next();
			System.out.println("Check out date ");
			String end = s.next();
			LocalDate ds = LocalDate.parse(start);
			LocalDate de = LocalDate.parse(end);
			total = ChronoUnit.DAYS.between(ds, de);
			if (persons > room * 3) {
				System.out.println("you have to book extra rooms.max room capasity is 3");
			}
		} while (persons >= room * 3);
		int sum, sum1, f;
		long total1;
		if (persons % room == 0) {
			sum = room * 1000;
		} else {
			f = persons - (room * 2);
			sum = (room * 1000) + (f * 250);
		}
		if (type.equals("ac") == true) {
			sum1 = sum + (room * 150);
		} else {
			sum1 = sum;
		}
		total1 = sum1 * total;
		System.out.println("Reg-Details:");
		System.out.println("name :" + name);
		System.out.println("address :" + address);
		System.out.println("no of rooms :" + room);
		System.out.println("no of guests :" + persons);
		System.out.println("room type :" + type);
		System.out.println("no of days :" + total);
		System.out.println("amount :" + total1);

	}

}
