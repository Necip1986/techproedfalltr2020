package day04scanner;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//1.odev:Kullanicidan karenin kenar uzunlugunu alin alani ve cevresini hesaplayin
		System.out.println("Karenin bir kenar uzunlugunu giriniz");
		double kenar = scan.nextDouble();
		System.out.println("Karenin alani="+kenar*kenar);
		System.out.println("Karenin cevresi="+4*kenar);
		
		//2.odev:Kullanicidan alinan bir sayinin kupunu hesaplayin
		System.out.println("Bir tam sayi giriniz");
		long sayi = scan.nextLong();
		System.out.println("Sayinin kupu="+sayi*sayi*sayi);
		
		//3.odev:Kullanicidan dikdortgenin kenar uzunluklarini alin alanini ve cevresini hesaplayin
		System.out.println("Dikdortgenin uzun kenarini giriniz");
		float uzun = scan.nextFloat();
		System.out.println("Dikdortgenin kisa kenarini giriniz");
		float kisa = scan.nextFloat();
		System.out.println("Dikdortgenin Alani="+uzun*kisa);
		System.out.println("Dikdortgenin Cevresi="+2*(uzun+kisa));
		
		//4.boyutlari kullanicidan talep edilen bir dikdortgenler prizmaninin hacmini bulan bir program yazin
		System.out.println("Prizmanin enini giriniz");
		double en=scan.nextDouble();
		System.out.println("Prizmanin boyunu giriniz");
		double boy=scan.nextDouble();
		System.out.println("Prizmanin yuksekligini giriniz");
		double yukseklik=scan.nextDouble();
		System.out.println("Prizmanin hacmi="+en*boy*yukseklik);
		
		//5.odev:yaricapi kullanicidan alinan bir cemberin cevresini ve alanini hesaplayan bir program yaziniz==>pi:3.34159 alan:pi*radius*radius
		//cevre:2*pi*r
		System.out.println("Cemberin yaricapini giriniz");
		float radius = scan.nextFloat();
		System.out.println("Cemberin alani="+3.34159*radius*radius);
		System.out.println("Cemberin cevresi="+2*3.34159*radius);
		
		//6.odev:kenar uzunluklari kullanicidan alinan bir ucgenin cevresini hesaplayan bir program yazin (byte kullanin)
		System.out.println("Ucgenin a kenarini giriniz");
		byte akenari=scan.nextByte();
		System.out.println("Ucgenin b kenarini giriniz");
		byte bkenari=scan.nextByte();
		System.out.println("Ucgenin c kenarini giriniz");
		byte ckenari=scan.nextByte();
		System.out.println("Ucgenin cevresi="+(akenari+bkenari+ckenari));
		
		//7.odev:mil'i km'ye ceviren bir program yaziniz double ile 1 mil=1.6km
		System.out.println("Mil miktarini giriniz");
		double mil = scan.nextDouble();
		System.out.println("km="+mil*1.6);
		
		//8.odev:saati saniyeye ceviren bir program yaziniz==>saniye=saat*60*60 (long)
		System.out.println("Saat miktarini girin");
		long saat=scan.nextLong();
		System.out.println("Saniye="+saat*60*60);
		
	scan.close();
		
		
		
		
		
		
		
				
		
		
	
		
	

	}

}
