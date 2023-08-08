package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalcDates {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2023-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2023-07-20T11:56:30");
		Instant d06 = Instant.parse("2023-08-05T01:30:26Z");
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nexttWeekLocalDate = d04.plusDays(7);	
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nexttWeekLocalDate = " + nexttWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nexttWeekLocalDateTime = d05.plusDays(7);	
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nexttWeekLocalDateTime = " + nexttWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nexttWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nexttWeekInstant = " + nexttWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0, 0)); //converte LocalDate para LocaDateTime.
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());

	}

}
