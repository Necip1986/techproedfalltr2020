package day31exceptions;

public class E06 {

	/*
	 * ClassCastException//object class'indan bir objeyi class'lari donusturuken hata olustu mesaji
	 */
	
	public static void main(String[] args) {

		Object obj = new Object(); //obj'yi String'e cevirecem
		
		try {
			
			String sObj = (String) obj;
			
		}catch(ClassCastException e) {
			
			System.out.println("Object data tipi String data tipine donusturulemez");
		
		}
		//String sObj = (String) obj; //explicit narrowing data tipi object olani stringe ceviriyorum

		
		

	}

}
