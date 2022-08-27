package day40lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda06 {

	public static void main(String[] args) {
		
		Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
		Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
		Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
		Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

		List<Course>courseList=new ArrayList<>(); //data tipi Course
		courseList.add(courseTurkishDay);
		courseList.add(courseTurkishNight);
		courseList.add(courseEnglishDay);
		courseList.add(courseEnglishNight);
		
		//System.out.println(courseList);//toString objeleri yazdirmak icin kullanilir UNUTMA
		
		System.out.println(avgScrBuyuk92(courseList));
		System.out.println(ogrSayi120denAz(courseList));
		System.out.println(kursSeaisSpring(courseList));
		System.out.println(ogrSayiReverse(courseList));
		System.out.println(avgScoreilk3(courseList));
		System.out.println(ogrSayisiIkinciAz(courseList));
	

	}

	//Average skorlarin tamaminin 92'den buyuk olup olmadigini kotrol eden bir program yaziniz
	
	public static boolean avgScrBuyuk92(List<Course>courseList ) {
		return courseList.stream().allMatch(t->t.getAverageScore()>92);
		
	}
	
	//Ogrenci sayilarinin hicbirinin 120'den az olmadigini kontrol eden bir program yaziniz
	
	public static boolean ogrSayi120denAz(List<Course>courseList) {
		return courseList.stream().noneMatch(t->t.getNumberOfStudents()<120);
	}
	
	//Kurs sezonlarinin herhangi birinin "Spring" olup olmadigini kontrol eden programi yaziniz

	public static boolean kursSeaisSpring(List<Course>courseList) {
		return courseList.stream().anyMatch(t->t.getSeason().equals("Spring"));
	}
	
	//kurslari ogrenci sayilarina gore buyukten kucuge siralayiniz
	
	public static List<Course> ogrSayiReverse(List<Course>courseList){
		return courseList.
				stream().
				sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).
				collect(Collectors.toList()); //collect ile list'in icine atiyoruz
	}
	
	//Kurslari average skorlarina gore buyukten kucuge siralayiniz ve ilk ucunu gosteriniz
	
	public static List<Course> avgScoreilk3(List<Course>courseList){
		return courseList.
				stream().
				sorted(Comparator.comparing(Course::getAverageScore).reversed()).
				limit(3).
				collect(Collectors.toList());
	}
	
	//kurslardan ogrenci sayisi en az olan ikinci kursu ekrana yazdiriniz
	
	public static List<Course> ogrSayisiIkinciAz(List<Course>courseList){
		return courseList.
				stream().
				sorted(Comparator.comparing(Course::getNumberOfStudents)).
				limit(2).
				skip(1).
				collect(Collectors.toList());
	}
	
}
