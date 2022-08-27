package day31exceptions;

public class E03 {

	/*
	  NullPointerException 
	 */
	public static void main(String[] args) {
		
		String s = "";
		System.out.println(s.length()); //ekranda sifir gorurum. lenght methodu string'in icindeki karakter sayisini verir 
		                                //karakter olmadigindan sifir verir

		String t = null;
		
		
		
		try {
			System.out.println(t.length()); 
			
		}catch(NullPointerException e) {
			
			System.out.println("null String'lerde lenght() methodu kullanilmaz");
		}
		
		//Run time exception'larda throws kullanilmaz zaten ayni mesaji run butonuna basinca aliyorum.
		
		//System.out.println(t.length()); //NullPointerException Exception verir. Bu Exception run'a basinca ortaya cikar. 
		                                  //Bu un-checked exception'dir. Run time exception handle edilmeden de calisabiliyor.
		
		
		
	}

}
