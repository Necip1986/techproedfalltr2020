package projecthashmap;

import java.util.HashMap;
import java.util.Scanner;

public class MapProject {

	public static void main(String[] args) {
		
		/*
      saveInfo() method olusturun:
      1)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
      2)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
      3)Ayni kimlik numarasi ile bilgi girilmesine engel olun.
      
      getInfo() method olusturun:
      1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
      2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.
      3)Map bos ise uygun mesaj versin. Bu database'de hicbir bilgi yok
      
      removeInfo() method olusturun:
      1)Kimlik numarasini girerek data silin.
      2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
      3)Collection bos ise kullaniciya hata mesaji verin.
      
      selectOption() method olusturun:
      1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
      
		 */
		HashMap<String,String>hm=new HashMap<>();
		selectOption(hm);
	}

	public static void saveInfo(HashMap<String,String>hm) {//static demeliyim cunku main metod icinde kullancam
		
		Scanner scan = new Scanner(System.in);
		String id="";
		
		do {
			System.out.println("Kimlik numaranizi giriniz\nGirisi durdurmak icin 'Q' tusuna basiniz");
			id=scan.next();
			//kullanicidan tc no al ve tekrarliya izin verme
			if(id.equalsIgnoreCase("q")) break;//break calistiginda do loop kirilir
			while (hm.containsKey(id)) {
				System.out.println(id+" kayitlarda var lutfen gecerli bir id giriniz");
				id=scan.next();
			}
			//next'ten sonra nextLine kullanirsaniz kodu araya yazin
			scan.nextLine();
			
			//kullanicidan isim al
			System.out.println("Tam isminizi giriniz");
			String isim=scan.nextLine();
			
			//kullanicidan adres al
			System.out.println("Adresinizi giriniz");
			String adres=scan.nextLine();
			
			//kullanicidan tel al
			System.out.println("Telefonunuzu giriniz");
			String tel=scan.nextLine();
			
			//map icin value olusturdum
			String ogrenci ="\nisim: "+isim+"\nAdres: "+adres+"\nTelefon: "+tel+"\n";
			
			//bilgileri hm'ye depoladik
			hm.put(id, ogrenci);
			
		} while (true);
		
		System.out.println(hm);
	}
	
	public static void getInfo(HashMap<String,String>hm) {
		
		Scanner scan=new Scanner(System.in);
		String id="";
		
		do {
			System.out.println("Ogrenci bilgisini almak icin id giriniz\nBilgi almayi durdurmak icin 'Q' tusuna basiniz");
			id=scan.next();
			if(id.equalsIgnoreCase("q")) {
				break;
			}else if(hm.isEmpty()) {
				System.out.println("Herhangi bir data yok");
				break;
			}else if(!hm.containsKey(id)){
				System.out.println("Bu id gecerli bir id degil lutfen gecerli bir id giriniz");
			}else {
				String ogrenciInfo=hm.get(id);
				System.out.println(id+" asagidaki bilgileri icerir: "+ogrenciInfo);
			}	
		} while (true);
	}
	
	public static void removeInfo(HashMap<String,String>hm) {
		Scanner scan = new Scanner(System.in);
		String id="";
		
		do {
			System.out.println("Kayit silmek icin id numarasi giriniz\nSilme islemini durdurmak icin 'Q' tusuna basiniz");
			id=scan.next();
			if(id.equalsIgnoreCase("q")) {
				break;
			}else if(hm.isEmpty()){
				System.out.println("Herhangi bir id yok");
				break;
			}else if(!hm.containsKey(id)) {
				System.out.println("Bu id gecerli bir id degil lutfen gecerli bir id giriniz");
			}else {
				String silinenData=hm.remove(id);
				System.out.println("Silinen ogrenci: \n"+silinenData);
			}
			
		} while (true);
		System.out.println(hm); //silmeden sonra son halini goreyim
		
	}
	
	public static void selectOption(HashMap<String,String>hm) {
		
		Scanner scan=new Scanner(System.in);
		String option="";
		
		do {
			System.out.println("Kullanmak istediginiz metodu seciniz(1-2-3)\n1:Ogrenci Ekleme"
					+ "\n2:Ogrenci Bilgisi Alma\n3:Ogrenci Kaydi Silme\nProgramdan Cikmak icin 'Q' tusuna basiniz");
			option=scan.next();
			if(option.equalsIgnoreCase("q")) {
				System.out.println("Programi kullandiginiz icin tesekkur ederiz...");
				break;
			}
			switch(option) {
			case "1":
				saveInfo(hm);
				break;
			case "2":
				getInfo(hm);
				break;
			case "3":
				removeInfo(hm);
				break;
			default:
				System.out.println("Yanlis method sectiniz tekrar deneyiniz");
			    break;
			}
			
		}while(true);
		
	}

}
