package day06ifstatement;

import java.util.Scanner;

public class Swap01 {

	public static void main(String[] args) {
		/*
		 * a variable nin degeri 12, b variablenin degeri 25 olsun oyle bir kod yaziniz ki
		   a 25, b 12 olsun
		 */
		
		Scanner scan =new Scanner(System.in);
		System.out.println("iki sayi giriniz");
		double a=scan.nextDouble(); //12
		double b=scan.nextDouble(); //25
		System.out.println("a: "+a);
		System.out.println("b:"+b);

		System.out.println("======");
		
		// 1. Yol: 3. bir variable olusturulur. temp variable'i
		double temp=0; //variable olusturulunca deger verilir genellikle sifir verilir
		temp = a; //atama yaptim temp=12 oldu. a'nin degeri ise yine a=12 olur. b'den 25 gelince 12 olur. yeni deger eskiyi oldurur. 
		a=b; //temp=12   a=25 oldu  b=25 yine
		b = temp; //boyle olunca temp=12  a=25 b=12 olur sonuc olarak.
		          //java kullanilmadigina inandigi variableri kendisi otomatik olarak siler.
		System.out.println("a: "+a);
		System.out.println("b:"+b);
		
		//2.yol: 3. bir variable kullanilmayacak. 1. yolda garbage collector kullandik java yoruldu java bunu tercih etmez.
		//I. hamle:a=a+b; yapcaz====II. hamle=b=a-b ==== III. hamle=a=a-b
		System.out.println("=========");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a: "+a);
		System.out.println("b:"+b);
		
		
		
		
		
		
		scan.close();
		
		
		
	}

}
