package day23foreachloopdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEachSoru022 {
	
	static int siraNo=1000;

	public static void main(String[] args) {
		/*
		   Giris yili + Ad ve Soyadinin ilk harfleri + Sira no seklinde ogrenci numarasi olusturan 
		   programi yaziniz
		   Giris yilini
		   ad ve soyadini kullanicidan aliniz. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String yil="2020";
		String yilRakam[]=yil.split("");
		
		String ad="";
		List<String>ls=new ArrayList<>();
		//System.out.println("Lutfen soyadinizi giriniz");
		//String soyad=scan.nextLine();
		
		do {
			System.out.println("Lutfen ogrenci adini giriniz\nogrenci girisi bitince 'x' giriniz");
			ad=scan.nextLine().toUpperCase();
			if(ad.equals("X")) {
				continue;
			}
			ls.add(ad);
			
		}while(!ad.equals("X"));
		
		System.out.println(ls);
		
		String temp="";
		int sira=1;
		for(String w:ls ) {
			for(String z:yilRakam) {
				if(z!=yilRakam[yilRakam.length-1] && z!=yilRakam[yilRakam.length-2]){
					continue;
				}
				temp+=z;
			}
			System.out.println(sira+". siradaki ogrencinin ogrenci numarasi: "+temp+w.charAt(0)+w.charAt(w.indexOf(" ")+1)+siraNo);
			siraNo++;
			sira++;
			temp="";
		}
		scan.close();
	}
}
