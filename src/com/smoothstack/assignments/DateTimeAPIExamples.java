/**
 * 
 */
package com.smoothstack.assignments;

import java.time.LocalDate;

/**
 * @author Thomas Davis
 *
 */
public class DateTimeAPIExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Answers for Date-Time API
		 * 
		 * 1.) LocalDateTime
		 * 
		 * 2.) .getDayOfWeek(), then .minusDays()
		 * 
		 * 3.) Zomeid is based upon city and location, ZoneOffset is a direct change of
		 * timezone.
		 * 
		 * 4.)
		 * 
		 */

		getMonthDays(1990);
	}

	public static LocalDate getMonthDays(int year) {
		LocalDate yearSelected = LocalDate.ofYearDay(year, 1);
		for (int i = 1; i < 13; i++) {
			System.out.println(yearSelected.lengthOfMonth());
			yearSelected = yearSelected.plusMonths(1);
		}
		return yearSelected;
	}

//	public static LocalDate getMondays(int year, int month) {
//		LocalDate yearMonth = LocalDate.of(year, month, 1);
////		yearMonth.
//	}

	public static boolean getFridayThirtheenth(int year, int month, int day) {
		LocalDate date = LocalDate.of(year, month, day) {
			if (date.getDayOfWeek().equals("FRIDAY") && day == 13) {
				return true;
			return false;
			}
		}
	}

}
