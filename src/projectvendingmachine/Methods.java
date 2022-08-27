package projectvendingmachine;

import java.util.Scanner;

public class Methods {
	
	public double money() {//musterinin yatirdigi parayi gormek
		Scanner scan = new Scanner(System.in);
		System.out.println("Kac dollar yatirmak istersiniz");
		double money = scan.nextDouble();
		return money;
	}
//Urunleri listeliyor, Urun numarasini musteriye sectirtip secilen urunun fiyatini return ediyor
	//ilk method musteriye urun sectirip fiyatini alma metodu olcak
	public double select(Products product) { //benim secicim product class'inin bir objesi olacak
		
		//ilk yapmam gereken musteriye urunleri gosterme select metodu calistiginda musteri urunleri gorur
		System.out.println(product.toString());
		
		//urun numarasi almak icin scanner kullanilir
		Scanner scan = new Scanner(System.in);
		//en makul loop do while loop'tur.
		
		do {
			System.out.println("Lutfen almak istediginiz urunun numarasini giriniz (1'den 10'a kadar)");
		    System.out.println("Cikis icin '0' a basiniz");
			product.setProductNum(scan.nextInt());//musterinin verdigi numarayi aldim productNum=3 oldu
			if(product.getProductNum()<0 || product.getProductNum()>10) {
				System.out.println("Lutfen gecerli bir product numarasi giriniz(1'den 10'a kadar)");
			}
		
		}while(product.getProductNum()<0 || product.getProductNum()>10);
		
		//musteri gecerli numara girerse musterinin sececegi 10 opsiyon var
		
		switch(product.getProductNum()) { //products class'ina koymustum
		case 0:
			System.out.println("Tesekkur eder tekrar bekleriz...");
			break;
		case 1:
			product.setPrice(product.getSnicker());
			break;
		case 2:
			product.setPrice(product.getChipsAhoy());
			break;
		case 3:
			product.setPrice(product.getPringles());
			break;
		case 4:
			product.setPrice(product.getMilano());
			break;
		case 5:
			product.setPrice(product.getReeses());
			break;
		case 6:
			product.setPrice(product.getCocaCola());
			break;
		case 7:
			product.setPrice(product.getFanta());
			break;
		case 8:
			product.setPrice(product.getWater());
			break;
		case 9:
			product.setPrice(product.getArizona());
			break;
		case 10:
			product.setPrice(product.getSkittles());
			break;
		default:
			
		}
		return product.getPrice();
	
	}
	
	public double balance(double price, double money, Products product) {//musteri 10 dolar yatirdi alacagi urun daha pahali ve para eklemesi gerekiyor eger eklemek istemiyorsa gulegule
		//adamin parasini price etkiliyor, 
		
		while(money<price) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Bakiye yetersiz para eklemek ister misiniz(Y/N)");
			
			char onay = scan.next().toUpperCase().charAt(0);
			
			if(onay=='N') {
				System.out.println("Bakiyeniz "+money);
				System.out.println("Tesekkur eder tekrar bekleriz...");
				break;
			}else if(onay=='Y'){
				System.out.println("Ne kadar eklemek istersiniz");
				double eklenecek = scan.nextDouble();
				money = money+eklenecek;
				System.out.println("Hesabinizda "+ money+ " dollar var");
			    price = select(product);
			   // System.out.println("Hesabinizda "+(money-price));
			}else {
				System.out.println("Lutfen 'Y veya 'N' seciniz...");
			}
		}
		
		return money;
		
	}
	
	public void purchase(double price, double money, Products product) {//musteriye satin aldircaz, product objesi de koyuyorum
		
		char onay = 'Y';
		while(money>=product.getPrice()) {
			
			//if(onay=='Y') {
			money = money - product.getPrice();
			System.out.println("Hesabinizda "+money+" dollar var");
			
			//musteriye baska birsey alacak mi diye soruyoruz
			Scanner scan = new Scanner(System.in);
			System.out.println("Alisverise devam etmek ister misiniz (Y/N");
			onay = scan.next().toUpperCase().charAt(0);
			
			if(onay=='N') {
				System.out.println("Tesekkur eder yine bekleriz...");
				break;
			}else if(onay=='Y') {
				product.setPrice(select(product));
				money = balance(product.getPrice(),money, product);
			}else {
				System.out.println("Lutfen 'Y' veya 'N' den birini seciniz");
			}
		scan.close();
		}
	
	}
	
	
	
	
	
	
	
	
	
}
