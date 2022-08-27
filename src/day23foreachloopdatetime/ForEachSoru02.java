package day23foreachloopdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEachSoru02 {

	static int no=1000;
	
	public static void main(String[] args) {
		
		/*
		   Giris yili + Ad ve Soyadinin ilk harfleri + Sira no seklinde ogrenci numarasi olusturan 
		   programi yaziniz
		   Giris yilini
		   ad ve soyadini kullanicidan aliniz. 
		 */
		
		Scanner scan=new Scanner(System.in);
		String isim="";
		
		List<String>isimler = new ArrayList<>();
		
		do { 
		    System.out.println("Lutfen ad ve soyadinizi giriniz");
		    isim=scan.nextLine();          //isim variable'ini do'nun icinde olusturdum o zaman local variable yani while icinde kullanamam
		    if(!isim.equalsIgnoreCase("X")) {
		    	isimler.add(isim);         //bu sikayeti String isim variable'ini do nun disinda olusturmaktir. disarda olusturduk
		    }    
		}while(!isim.equalsIgnoreCase("X"));
		
		System.out.println(isimler);
		
		//Student Id uretmek icin for-each-loopkuruyorum
		
		for(String w:isimler) {
			System.out.println(w+" id: "+20+w.charAt(0)+w.charAt(w.indexOf(" ")+1)+no);
			no++;
			                //C' yi almak icin space'in index'ini bulucam w.indexof(" ")+1 soyadin ilk karakterini verecek
		}
		scan.close();

	}

}
