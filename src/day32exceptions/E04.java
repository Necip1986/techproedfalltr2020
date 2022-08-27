package day32exceptions;

public class E04 {

	public static void main(String[] args) {

		try {
		
			hata();

		}catch(IllegalArgumentException e) {
	        System.out.println(e); //Exception'in adi ve mesaji yazar consolda
		 
		    System.out.println(e.getMessage());//sadece mesaji yazar
			
			e.printStackTrace(); //detayli mesaj veriyor
		}
		

	}
	
	public static void hata() {
		throw new IllegalArgumentException("Gecerli data giriniz");
	}

}
