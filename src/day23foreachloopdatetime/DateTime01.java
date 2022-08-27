package day23foreachloopdatetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

	public static void main(String[] args) {
		
		//Java'da LocalDate class'i var.
		
		LocalDate date1 = LocalDate.now(); //object olusturulur
		System.out.println(date1); //2020-10-08 bu kodu yarin icin calistirirsam yarinin tarihini verir. Bu standart formattir.
		
		date1.plusDays(3); //dersem guncel tarihe 3 gun ekler 
		System.out.println(date1.plusDays(3)); //2020-10-11 verir
		
		System.out.println(date1.plusMonths(2)); //aya iki eklemis oluyoruz. gun degismez sadece ay eklenir
		
		System.out.println(date1.plusDays(3).plusMonths(2)); //once 3 gun ekler sonra 2 ay ekler buna metod chain denir.
		
		System.out.println(date1.plusYears(4)); //bugunden 4 yil sonraya gider
		
		//tarihte geri gitme
		
		System.out.println(date1.minusDays(11)); //11 gun geri gider. ayi da geri goturur
		System.out.println(date1.minusMonths(11));//11 ay geri gider yilda geri gider
		System.out.println(date1.minusYears(4)); //4 yil geri gittik
		
		System.out.println(date1.plusYears(3).minusMonths(4));
		
		
		//Java'da LocalTime class'i var. ilk once obje olusturuyoruz
		
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);//22:45:56.093 bilgisayardan alir bu saati burasi 24 saat araligi veriyor
		
		System.out.println(time1.plusMinutes(12));// bilgisayar saatine gore 12 dk sonraya gider
		System.out.println(time1.plusHours(12)); //12 saat ekler
	
		//zaman da geri gitme
		
		System.out.println(time1.minusMinutes(13));
		System.out.println(time1.minusHours(3));
		
		
		//Baska ulkelerin saati bulmak
		//LocalTime time2 = LocalTime.now(ZoneId.of("Moscow")); //moscow yazinca unknown der run time error verir
		LocalTime time2 = LocalTime.now(ZoneId.of("Europe/Moscow"));
		LocalTime time3 = LocalTime.now(ZoneId.of("Turkey"));
		System.out.println(time2);
		System.out.println(time3);
		
		//TARIH'LERIN FORMATLARINI DEGISTIRMEK
		//tarih formatlarini degistirmek icin DateTimeFormatter class'ini kullaniriz
		//ilk once obje olusturulur
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd:MMM:yy"); //kucuk m minute'lerde kullanilir M month'lar icin kullanilir
		System.out.println(date1.format(dtf1)); //08/10/2020
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //3 tane MMM yazinca oct , jan
		System.out.println(date1.format(dtf2));
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd:MMMM:yy"); //ayin tamamini yazar
		System.out.println(date1.format(dtf3));
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("d:MMMM:yyyy");
		System.out.println(date1.format(dtf4));
		DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MMMM:d");
		System.out.println(date1.format(dtf5));
		
		//ZAMAN FORMATINI DEGISTIRMEK
		//Tekrar obje olusturulur
		DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("hh:mm"); //kucuk h kucuk m 12 saatlik dilimi kullanilir
		time1.format(dtf6);
		System.out.println(time1.format(dtf6));
		DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm"); //buyuk H zaman dilimi olarak 24 alir
		System.out.println(time1.format(dtf7)); 
	}

}
