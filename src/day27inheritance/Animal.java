package day27inheritance;

public class Animal {

	//constructor olusturuyorum
	
	public Animal() { //metod ismi class ismi ile ayni olur ve return type olmaz
		System.out.println("Animal parametresiz constructor");
		
	}
	
	//hareket etme, yeme, icme metodlari olusturuyoruz
	
	public void hareket() { //bir instance metod'tur static keyword yoktur. static olmayan metodlara obje ile ulasilir o
		                    //o halde runner class'inda obje olusturucaz
		System.out.println("Hareket eder.");
	}
	
	public void yeme() {
		System.out.println("Yemek yerler.");
	}
	
	public void icme() {
		System.out.println("Su icerler.");
	}

}
