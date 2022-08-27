package day05typecasting;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		//6.odev:kenar uzunluklari kullanicidan alinan bir ucgenin cevresini hesaplayan bir program yazin (byte kullanin)
		
		System.out.println("Lutfen Ucgenin kenarlarini giriniz");
		byte a=scan.nextByte();
		byte b=scan.nextByte();
		byte c=scan.nextByte();
		
		//parantez iclerini mumkun oldugunca basit tutun
		int cevre=a+b+c;
		
		System.out.println("Cevre:"+cevre);

		scan.close();
		
		
		
		
	}

}
