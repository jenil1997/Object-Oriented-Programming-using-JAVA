package Datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_time_format {

	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.now();
		System.out.println("before formatin  "+dt);
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("E,dd:MM:YYYY,HH:MM::SS");
		String formatDate=dt.format(format);
		System.out.println("after formating   "+formatDate);

	}

}
