package day11stringmethods;

public class ForLoop01 {

	public static void main(String[] args) {
		// Ekrana 10 kere "hi" yazdirin. programcilikta tekrar tekrar yazmak sikintilidir. bir yol bulup tekrardan kurtulmaliyiz.
		//Loop yontemi: dongu demek. Tekrar tekrar ayni seyi yapmak zorunda kaldigimizda ayni kodu bircok defa yazmak yerine loop lari kullaniriz.
		// java 4 tane Loop var
		/*
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		*/
		
		//1=For-Loop for in ici noktali virgullerle 3 bolgeye ayriliyor.
	    //baslangic kismi 1 dersek 1 den baslar. ikinci bolge bitise karar verir ornek 10 da bitsin. ucuncu kisim ise increment yapilir 
		//1'den 10'a gidecegim icin
		
		
		for( int i=1; i<=3; i++)  {                //eger 10'dan 1'e gideceksem azaltmam gerek increment olur eger i+=2 dersem 2 tane yazar
		   System.out.println("Hi!");
		}
		
		//100'den 1'e kadar tum tamsayilari ekrana ayni satirda aralarina bosluk koyarak yaziniz
		
		for(int i=100; i>=1; i-- ) {
			System.out.print(i+" ");
		}
		
	}

}
