package main;

import java.time.LocalDate;
import java.time.Month;

public class Exemplu2 {

	public static void main(String [] args) {
		LocalDate ld1 = LocalDate.now();
		LocalDate ld2 = LocalDate.of(2018, 1, 12);
		LocalDate ld3 = LocalDate.of(2018, Month.JANUARY, 12);
		
		System.out.println(ld3);
	}
}
