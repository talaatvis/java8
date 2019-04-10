package com.java8.features.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeDemo {
	public static void main(String[] args) {
		LocalDate test = LocalDate.of(2019, Month.JANUARY, 01);
		
		LocalDate d = LocalDate.now();
		if(test.isBefore(d)) {
			System.out.println("test is before - updated from gitkraken" );

		}
		LocalTime t = LocalTime.now();
		LocalTime tzone = LocalTime.now(ZoneId.of("Egypt"));
		Instant i =Instant.now();
		System.out.println("GMT dateTime is := "+i);
		System.out.println("Egy Time := "+tzone);
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(d);
		System.out.println(t);
		System.out.println(dt);
		
		// to get custom date as date 
		LocalDate cudtomDate = LocalDate.of(1989, Month.JANUARY, 01);
		System.out.println(cudtomDate);
		
		//ZoneId.getAvailableZoneIds().forEach(i->System.out.println(i));
		
	}
}
