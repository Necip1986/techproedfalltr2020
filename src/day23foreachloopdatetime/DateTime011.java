package day23foreachloopdatetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime011 {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);// Guncel tarihi verir
		System.out.println(date1.plusDays(5));//5 gun sonranin tarihini verir
		System.out.println(date1.plusMonths(2));//2 ay sonranin tarihini verir
		System.out.println(date1.plusYears(3));//3 yil sonranin tarihini verir
		date1.plusDays(5);
		date1.plusYears(2);
		date1.plusMonths(2);
		System.out.println(date1);
		
		System.out.println(date1.minusDays(5));//5 gun onceki tarih
		System.out.println(date1.minusMonths(2));
		System.out.println(date1.minusYears(3));
		
		System.out.println(date1.plusYears(3).minusYears(2));//1 yil sonranin tarihini verir
		
		//LocalTime class'i
		LocalTime time1 = LocalTime.now();
		System.out.println(time1); //guncel bilgisayardaki saati verir
		System.out.println(time1.plusHours(3));//3 saat sonrasi
		System.out.println(time1.minusHours(3)); //3 saat oncesi
		
		//Baska ulkelerin saatleri. Ilk once object olusturuyoruz
		LocalTime time2 = LocalTime.now(ZoneId.of("Europe/Moscow"));
		System.out.println(time2);
		
		//Tarih ve Zaman formatini degistirme
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH/mm");
		System.out.println(dtf); //Value(HourOfDay,2)'/'Value(MinuteOfHour,2) bunu yazdirir
		System.out.println(time1.format(dtf));
		
		
		

	}

}
