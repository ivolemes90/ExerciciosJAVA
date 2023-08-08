package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertGlobalLocal {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2023-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2023-07-20T11:56:30");
		Instant d06 = Instant.parse("2023-08-05T01:30:26Z");
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());		
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));			
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 Mês = " + d04.getMonthValue());
		System.out.println("d04 Ano = " + d04.getYear());		
		System.out.println("d05 hora = " + d05.getHour());		
		System.out.println("d05 Minutes = " + d05.getMinute());		
		
		
		
	}

}
