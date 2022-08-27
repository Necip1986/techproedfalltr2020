package day13whileloop;

import java.util.Scanner;

public class SlaytSoru6 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan başlangıç ve bitiş harflerini alın ve başlangıç harfinden başlayıp bitiş harfinde
           biten tüm harfleri büyük harf olarak ekrana yazdırın.
		 */
		//char larda buyuk harfe cevirme metodu yok onun icin stringin yanina koymaliyiz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen baslangic harfini giriniz");
		char bas=scan.next().toUpperCase().charAt(0); //toupporcase string den sonra konulabilir next metodu String dondurur onun icin 
		                                              //next ten sonra upporcase kullanilr
		System.out.println("Lutfen bitis harfini giriniz");
        char bit=scan.next().toUpperCase().charAt(0);
       
        if(!(bas>='A' && bas<='Z') || !(bit>='A' && bit<='Z')) {
        	System.out.println();
        }else if(bas<=bit) {
        	for(char i=bas; i<=bit; i++) {
            	System.out.print(i+" ");
        	}
        }else {
        	for(char i=bas; i>=bit; i--) {
            	System.out.print(i+" ");
        }
        
        }
        
        
        scan.close();
        
		
	}

}
