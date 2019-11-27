package Datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date_time {

	public static void main(String[] args) {
		System.out.println("today date");
		LocalDate date=LocalDate.now();//create date object
		System.out.println(date);//display the current date
		
		System.out.println("today time");
		LocalTime time=LocalTime.now();//create time object
		System.out.println(time);//display the current time
		
		System.out.println("current date and time");
		LocalDateTime dt=LocalDateTime.now();//create date and time object
		System.out.println(dt);//display date and time
		

	}

}
