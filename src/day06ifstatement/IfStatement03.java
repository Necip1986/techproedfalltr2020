package day06ifstatement;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		/*
		 * Kullainicidan bir karakter alin. Bu karakter buyuk harf ise buyuk harf yazdirin. kucuk ise kucuk harf yazdirin
		 * harf degilse harf degil yazdirin
		 */
		Scanner scan=new Scanner(System.in);
		/*System.out.println("Lutfen bir karakter giriniz");
		char ch=scan.next().charAt(0);
		
		if(ch>='A' && ch<='Z') {  //&& ve demek
			System.out.println("Buyuk Harf");
		}
		if(ch>='a' && ch<='z') {
			System.out.println("Kucuk Harf");
		}
		
		if(!(ch>='A' && ch<='Z') && !(ch>='a' && ch<='z')) { //|| veya isareti !(ch>='A' & ch<='Z') buyuk harf olmasin
			//!true=false               !false=true     false||true ise true olur onun icin  && kullanilir iki && daha hizli calisir
			System.out.println("Harf Degil");
			
		}
   
		scan.close();
		*/
		/*
		 Logical Operator (Mantik islemleri)
		 1) And islemi: sembolu & veya &&'dir. && sembolu daha hizli calisir. Bu yuzden genellikle && kullanilir.
		                true && true=true
		                true && false=false              cay kahve ornegi 
		                false && true=false
		                false && false=false
		  
		 2) Or sembolu: sembolu ||'dur.
		                true || false = true
		                false || true = true
		                true || true = true
		                false || false = false
		              
		 3) Not islemi: Sembolu !'dir.  ===>Exclamation Mark
		                !true=false olur
		                !false=true olur
		                
		                
		 */
		System.out.println("Lutfen bir karakter giriniz");
		char ch=scan.next().charAt(0);
		if(ch>='A' && ch<='Z') {
			System.out.println("buyuk harf");
		}
		if(ch>='a' && ch<='z') {
			System.out.println("kucuk harf");
		}
		if(!(ch>='A' && ch<='Z') && !(ch>='a' && ch<='z')) {
			System.out.println("harf degil");
		}
		scan.close();
		
		
	}

}
