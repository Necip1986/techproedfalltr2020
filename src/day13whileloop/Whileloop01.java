package day13whileloop;

public class Whileloop01 {

	public static void main(String[] args) {
		
		// for loop kullanarak 1 den 5'e kadar tamsayilari ekrana yazdiriniz
		
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
		System.out.println("=======");
		//while - loop kullanarak 1'den 5'e kadar tamsayilari ekrana yazdiriniz
		
		int i=1; //baslangic degeri basa yazilir ve while loop ustune yazilir
		
		while(i<=5) { //bitis kurali parantezin icine yazilir
			System.out.println(i); //alta veya uste koyarsak incerement etkiler
			i++;
			
		}
		//soz dizimi farklidir ikisi de aslinda aynidir.
		
		//while loop kullanarak 10'dan kucuk sayma sayilarini ayni satirda aralarina bosluk koyarak yaziniz
		System.out.println("======");
		
		int bas=1;
		while(bas<10) {
			System.out.print(bas+" ");
			bas++;
				
		}
		//while loop kullanarak 50 den kucuk cift sayilarini sayilari ayni satirda aralari bosluk birakarak yaziniz
		System.out.println();
		int k=1;
		while(k<50) {
			if(k%2==0) {
				System.out.print(k+" ");
			}
			k++;
		}
		
		//while loop kullanarak "Java kolaydir" Stringini terstes yazdiriniz
		System.out.println();
		
		String str="Java kolaydir";
		
		int j=str.length()-1;
		while(j>=0) {
			System.out.print(str.charAt(j));
			j--;
		}
		
		
	}

}
