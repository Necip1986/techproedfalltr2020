package day05typecasting;

public class TypeCasting01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/*
		 byte < short < int < long < float < double
		 
		 Kucuk data typelarini buyuk data typelarina cevirmek kolay bir is oldugundan java bu islemi bizim yardimimiza ihtiyac duymadan
		 otomatik olarak yapar
		 ismi Auto Widening Casting'dir. otomatik genisletme islemi
		  */
		 

		byte b1=12; //byte i shorta koydu. kucukleri direk buyuklere atabiliyoruz.
		short s1=b1;
		
		int i1=b1;
		float f1=b1;
		
		/*
		  byte < short < int < long < float < double
		  java buyuk kutuyu kucuge koymak istemez bunu riskli olarak gorur. bu islemi bizim yapmamizi ister.
		 
		 buyuk data tipine kucuk data tiplerine cevirme islerini java otomatik olrak yapmaz bu cevirmeyi biz asagidaki gibi kod yazarak yapariz.
		 bunun ismi "Explicit"'tir. (acikca demektir).explicit norrowing casting
		 */
		
		short s2=121;
		byte b2=(byte)s2; //israr edersek parantez icine kucuk data type yazilir. explicit yapilir
	
		
		
	}

}
