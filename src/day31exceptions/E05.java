package day31exceptions;

public class E05 {

	/*
	  parseInt() ve
	 
	  NumberFormatException //sayi formatinda degil hatasi
	  
	 */
	public static void main(String[] args) {
		
		//java'da sadece rakamlardan olusan String'leri sayiya cevirebiliriz
		//Integer wrapper class'inin icinde parseInt() (degistir demek parse) methodunu kullaniriz
		String s = "123";
		
		System.out.println(s+5); //concatination
		
		int iS = Integer.parseInt(s);

		System.out.println(iS+5); //128 verir
		
		String t = "1a2b"; //parseInt() bunu sayi yapamaz sadece rakamlardan olusanlari yapar
	    System.out.println(t+5);//1a2b5
		
	    try {
	    	
	    	int iT = Integer.parseInt(t);
	    	System.out.println(iT+5);
	    	
	    }catch(NumberFormatException e) {
	    	System.out.println("String olusturulurken rakam disinda karakterler kullanilmis");
	    }
//		int iT = Integer.parseInt(t);
//		System.out.println(iT+5); //Run Time Error verir
	
	
	
	}

}
