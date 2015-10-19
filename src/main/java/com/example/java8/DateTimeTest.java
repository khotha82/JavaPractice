package com.example.java8;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Created by krishna_hotha on 5/6/15 2015.
 */
public class DateTimeTest {

	public static void main(String[] args) {

		DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("yyyy-MM-dd");

		System.out.println(DateTime.parse("1990-01-01", dateTimeFormatter));
	}
}
