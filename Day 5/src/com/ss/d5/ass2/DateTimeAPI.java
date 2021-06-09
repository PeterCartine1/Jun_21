/**
 * 
 */
package com.ss.d5.ass2;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

/**
 * @author peter
 *
 */
public class DateTimeAPI {

	/**
	 * 
	 */
	public DateTimeAPI() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DateTimeAPI dta = new DateTimeAPI();
		System.out.println(dta.storeBirthday());
		System.out.println(dta.previousThursday(LocalDate.of(2021, Month.JUNE, 8)));
		System.out.println(dta.instantToZonedDateTime(dta.zonedDateTimeToInstant(ZonedDateTime.now()), "Asia/Tokyo"));
		System.out.println(dta.zonedDateTimeToInstant(ZonedDateTime.now()));
	}

	public LocalDateTime storeBirthday() {
		LocalDateTime birthday = LocalDateTime.of(1999, 07, 02, 3, 35, 14, 446334029);
		return birthday;
	}

	public LocalDate previousThursday(LocalDate day) {
		LocalDate previousThursday = day.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
		return previousThursday;
	}

	/*
	 * The difference between the ZoneId and ZoneOffset is ZoneOffset inherits the
	 * ZoneId class and implements the Comparable interface to give you a time zone
	 * relative to UTC. ZoneId is just a time zone identifier that allows you to
	 * convert between an Instant and LocalDateTime
	 */
	
	public ZonedDateTime instantToZonedDateTime(Instant intstant, String timeZone) {
		return intstant.atZone(ZoneId.of(timeZone));
	}
	
	public Instant zonedDateTimeToInstant(ZonedDateTime zonedDateTime) {
		return zonedDateTime.toInstant();
	}
	
	public int[] lengthofEachMonth(int year) {
		int[] monthLengths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (year % 4 == 0) {
			monthLengths[1] = 29;
		}
		return monthLengths;
	}
	
	public List<LocalDate> everyMondayOfMonth(Month month) {
		List<LocalDate> everyMonday = new ArrayList<>();
		for(int i=0; i < month.minLength(); i++) {
			MonthDay monthDate = MonthDay.of(month, i);
			LocalDate date = monthDate.atYear(2021);
			if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
				everyMonday.add(date);
			}
		}
		return everyMonday;
	}
	
	public boolean isFriday13th(LocalDate date) {
		if (date.getDayOfWeek() == DayOfWeek.FRIDAY & date.getDayOfMonth() == 13) {
			return true;
		} else {
			return false;
		}
	}
}
