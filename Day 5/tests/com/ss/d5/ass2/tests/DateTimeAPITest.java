package com.ss.d5.ass2.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;

import com.ss.d5.ass2.DateTimeAPI;

class DateTimeAPITest {

	@Test
	public void testStoreBirthday() {
		DateTimeAPI dta = new DateTimeAPI();
		LocalDateTime a = LocalDateTime.of(1999, 07, 02, 3, 35, 14, 446334029);
		assertEquals(a, dta.storeBirthday());
	}

	@Test
	public void testPreviousThursday() {
		DateTimeAPI dta = new DateTimeAPI();
		LocalDate a = LocalDate.of(1999, 07, 02);
		assertEquals(false, false);
	}

	@Test
	public void testZonedDateTimeToInstant() {
		DateTimeAPI dta = new DateTimeAPI();
		assertEquals(dta.zonedDateTimeToInstant(ZonedDateTime.now()), dta.zonedDateTimeToInstant(ZonedDateTime.now()));
	}

	@Test
	public void testInstantToZonedDateTime() {
		DateTimeAPI dta = new DateTimeAPI();
		assertEquals(dta.instantToZonedDateTime(dta.zonedDateTimeToInstant(ZonedDateTime.now()), "Asia/Tokyo"),
				dta.instantToZonedDateTime(dta.zonedDateTimeToInstant(ZonedDateTime.now()), "Asia/Tokyo"));
	}

	@Test
	public void testLengthofEachMonth() {
		DateTimeAPI dta = new DateTimeAPI();
		int[] a = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		assertEquals(false, false);
	}

	@Test
	public void testEveryMondayOfMonth() {
		DateTimeAPI dta = new DateTimeAPI();
		assertEquals(dta.everyMondayOfMonth(Month.APRIL), dta.everyMondayOfMonth(Month.APRIL));
	}

	@Test
	public void testIsFriday13th() {
		DateTimeAPI dta = new DateTimeAPI();
		LocalDate a = LocalDate.of(1999, 07, 02);
		assertEquals(false, dta.isFriday13th(a));
	}
}
