package day40lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Lambda07 {

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
		
		System.out.println(ogrSayiAvgScr93Bir(courseList));
		System.out.println(ogrSayiAvgScr93Iki(courseList));
		System.out.println(avgScr140(courseList));
		System.out.println(dayCourseSayi(courseList));
		System.out.println(maxAvgScr130(courseList));
		System.out.println(minAvgScr150(courseList));

	}
	//Average score'lari 93'ten fazla olan kurslarin ogrenci sayilari toplamini bulunuz
	
	public static int ogrSayiAvgScr93Bir(List<Course>courseList) {
		return courseList.stream().filter(t->t.getAverageScore()>93).map(t->t.getNumberOfStudents()).reduce(0, Integer::sum);
	}
	
	public static int ogrSayiAvgScr93Iki(List<Course>courseList) {
		return courseList.stream().
				filter(t->t.getAverageScore()>93).
				mapToInt(t->t.getNumberOfStudents()). //map yerine MapToInt yazinca sum metodu cikiyor
				sum();			
	}
	//ogrenci sayilari 140'dan fazla olan kurslarin average scorunu bulunuz
	
	public static OptionalDouble avgScr140(List<Course>courseList) {
		
		return courseList.
				stream().
				filter(t->t.getNumberOfStudents()>140).
				mapToDouble(t->t.getAverageScore()).
				average();
	}
	//Daytime course'larin sayisini bulan bir program yaziniz
	public static long dayCourseSayi(List<Course>courseList) {
		return courseList.
				stream().
				filter(t->t.getCourseName().contains("Day")).
				count();
	}
	//ogrenci sayilari 130'dan fazla olan kurslarin max average scorunu bulunuz
	public static OptionalDouble maxAvgScr130(List<Course>courseList) {
		return courseList.
				stream().
				filter(t->t.getNumberOfStudents()>130).
				mapToDouble(Course::getAverageScore).
				max();
	}
	//ogrenci sayilari 150'den az olan kurslarin min average scorunu bulunuz
	public static OptionalDouble minAvgScr150(List<Course>courseList) {
		return courseList.
				stream().
				filter(t->t.getNumberOfStudents()<150).
				mapToDouble(Course::getAverageScore).
				min();
	}
	
}
