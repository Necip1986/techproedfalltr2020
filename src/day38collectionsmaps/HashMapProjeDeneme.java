package day38collectionsmaps;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapProjeDeneme {

	public static void main(String[] args) {
		/*
		   1-Kullanicidan bircok kimlik numarasini (4 haneli), tam ismini adresini telefonunu alin
		     
		   2-Kimlik numarasini key olarak diger bilgileri value olarak bir map'e depolayin
		   
		   3-Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
		 */
		
		Scanner scan = new Scanner(System.in);
		String id = "";
		
		HashMap<String, String>person = new HashMap<>();
		
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
		    
		    person.put(id, "adi: "+name1+" "+name2+", adresi: "+adress+", tel: "+telNo+"\n");
		    
		}while(!id.equals("Q"));

		System.out.println(person);
		
		
		
	}

}
