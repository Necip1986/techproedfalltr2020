package day32exceptions;

public class E02 {

	/*
	   1-Exception olustugunda consolda sadece mesaji gormek isterseniz "e.getMessage" kullaniniz.
	 */
	public static void main(String[] args) {
		
		int a=12;
		int b=0;
		
		try {
		System.out.println(a/b);

		}catch(ArithmeticException e) { //Arithmetic exception'in sadece mesajini gormek istiyorum o zaman getMesage kullanilir
			System.out.println(e.getMessage());
		}
	}

}
