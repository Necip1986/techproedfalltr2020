package day38collectionsmaps;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapProject {

	static HashMap<String, String>person = new HashMap<>();

	public static void main(String[] args) {
		/*
		   saveInfo() method olusturun:
         1)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
         2)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
         3)Ayni kimlik numarasi ile bilgi girilmesine engel olun.
         
         getInfo() method olusturun:
         1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
         2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.
         
         removeInfo() method olusturun:
         1)Kimlik numarasini girerek data silin.
         2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
         3)Collection bos ise kullaniciya hata mesaji verin.
         
         selectOption() method olusturun:
         1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
         
		 */
		
		saveInfo();
		getInfo();
		removeInfo();
		
	}
	public static void removeInfo() {
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Lutfen bilgilerine ulasmak istediginiz kimlik numarasini giriniz\ncikmak icin 1'i tuslayiniz");
			String kimlikNo=scan.nextLine();
			if(kimlikNo.equals("1")) break;
			System.out.println(person.get(kimlikNo));
			
		}while(true);
		
	}

	public static void getInfo() {
		
	}

	public static void saveInfo() {
		Scanner scan = new Scanner(System.in);
		String id = "";
		
		
		do {
			System.out.println("Kimlik numarasini giriniz.\nBilgi girisini durdurmak icin 'Q' tusuna basiniz");
		    id = scan.next();
		    
		    if(id.equalsIgnoreCase("Q")) break;
		
		    System.out.println("Ilk isminizi giriniz");
		    String name1=scan.next();
		    
		    System.out.println("Soy isminizi giriniz");
		    String name2 = scan.next();
		    
		    System.out.println("Adresinizi giriniz");
		    String adress = scan.next();
		    
		    System.out.println("Telefon numaranizi 10 haneli olarak giriniz");
		    String telNo = scan.next();
		    
		    person.put(id, name1+" "+name2+"\n"+adress+"\n"+telNo);
		    
		}while(!id.equals("Q"));

		System.out.println(person);
		
	}

}
