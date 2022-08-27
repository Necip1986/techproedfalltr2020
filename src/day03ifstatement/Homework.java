package day03ifstatement;

public class Homework {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//islem onceligi      
		//38 / 2 - ( 4 + 3) * 2 = ?             8 + 2 * ( 14 - 6 / 2) - 12 
		System.out.println(38 / 2 - ( 4 + 3) *2 );//5
		System.out.println(8 + 2 * ( 14 - 6 / 2) - 12 );//18

		// modulus odev
		//c = ? 
		int a = 20 ; int b = 8 ; int c = a % b ;
		System.out.println(a%b);//c=4 olur
		////d = ?
		int x = 20 ; int y = 5 ; int d = x % y ; 
		System.out.println(x%y);//0
		
		
		int num1 = 45;
		int num2 = 13;
		int remainder = num1 % num2;
		System.out.println("Remainder:" + remainder);
		
		//kullanicinin girdigi 4 basamakli bir sayiyinin ilk ve son rakaminin toplamini ekrana yazdiran bir program yaziniz
		int z = 4352;
		System.out.println(z%10 + z/1000);
		
		//3 basamakli bir sayinin tum rakamlari toplamini bulun
		int tum = 234;
		System.out.println(tum%10 + (tum/10)%10 + tum/100);
	
		
		
	
		
		
		//bir int variable olusturun ve degerini bir artirin
		int yu = 45;
		System.out.println(yu);
		yu = yu + 1;
		System.out.println(yu);
		yu+=1;
		System.out.println(yu);
		yu++;
		System.out.println(yu);
		
		//bir int variable olustur ve degerini 3 farkli yoldan bir azalt
		int ne = 23;
		System.out.println(ne);
		ne = ne - 1;
		System.out.println(ne);
		ne-=1;
		System.out.println(ne);
		ne--;
		System.out.println(ne);
	
		int numA = 2;
		int numB = 3;
		String str1 = "Cok";
		String str2 = "Calis";
		//Cok Calis, 5 Cok, Calis23 ve Cok1 i ekrana yazdir
		
		System.out.println(str1 + " " + str2);
		System.out.println(numA + numB + " " + str1);
		System.out.println(str2+numA+numB);
		System.out.println(str1+(numB-numA));
		
		int n1 = 2;
		int n2 = 3;
		String s1 = "Study";
		String s2 = "Hard";
		//ekrana 61 Study-1 yazdir
		
		System.out.println(n1*n2 + "" + (n2-n1) + " " + s1 + (n1-n2));
		
		
		
		int j = 2347;
		int ilkRakam=j/1000;
		System.out.println("Ilk Rakam:" + ilkRakam);
		int sonRakam=j%10;
		System.out.println("Son Rakam:" + sonRakam);
		System.out.println(ilkRakam+sonRakam);
		
		
		 
		
		
		
		
	}

}
