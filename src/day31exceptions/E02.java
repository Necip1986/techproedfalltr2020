package day31exceptions;

public class E02 {

	/*
	     ArithmeticException
	 */
	public static void main(String[] args) throws ArithmeticException {
		
		int a=12;
		int b=3;//0 yazinca catch calisir
		
		try {
			
			System.out.println(a/b);
			
		}catch(ArithmeticException e) { //matematiksel islem yaptigimizda muhtemel problemleri onlemek icin kullanilir
			
			System.out.println("Sayilar sifira bolunemezler");
		
		}finally {//biz bazen exception olussa da olusmasa da bazi kodlari calistirma ihtiyaci duyariz o zaman kullanilir.
			
			System.out.println("finally block");
		}
		
		//catch block calistiginda finally block calisir diyebiliriz.
		//finally block hata olsa da calisir olmasa da
		
		//System.out.println(a/b); //2 tip exception vardir bazilari CTE verir bazilari vermez
                                 //Java bu hatayi run butonuna basinca farketti oyuzden run time Exception denir.
		
		//2. Yontem: throws ArithmeticException kullanmak yine calisir. Yani run time Exception olunca kullanilsa da olur kullanilmasada 
	
	
	}

}
