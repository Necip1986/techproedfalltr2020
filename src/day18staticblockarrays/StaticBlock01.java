package day18staticblockarrays;
 
public class StaticBlock01 {
	
	static double pi;
	static String s;
	/*
	   1-Static block static variable'lara deger atamasi yapmak(initialize) icin kullanilir.
	   2-Static block class olusturulurken butun methodlardan (main method dahil) once calistirilir.herseyden once calistirilir
	     class olustugu anda elinizde pi sayisi var olmus olur
	   3-Birden fazla static block varsa ustteki once calisir
	     static block main methodun da altina koyarsak yine main method dan once calisir
	 
*/
	static {    //buna static block denir
	//	int x=10;  java x i otomatik olarak static kabul eder
		pi=3.14;  //initialize ettim, deger atamasi yaptim. Bana lazim olanlari toparliyorum static block ile
	System.out.println(pi);
	}
	
	static {
		s="Ali "+pi;
		System.out.println(s);
	}
	public static void main(String[] args) {
		
		alanDaire(10);

	}

	public static void alanDaire(double r) {
		System.out.println("Dairenin alani:"+pi*r*r);
	}
	

	static {    //buna static block denir
		pi=3.14;  //initialize ettim, deger atamasi yaptim. Bana lazim olanlari toparliyorum static block ile
	System.out.println(pi);
	}
}
