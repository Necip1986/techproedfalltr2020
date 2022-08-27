package day12forloop;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ForloopAsal {

	public static void main(String[] args) {
		
		//1'den 20'ye kadar olan asal sayilarin toplamini bulunuz
		
//		Scanner scan= new Scanner(System.in); //2,3,5,7,11,13,17,19
//		System.out.println("sayi giriniz");
//		int sayi=scan.nextInt();
		
		Set<Integer>asal=new HashSet<>();
		
        int sayac = 0;
        int sum=0;
        
        for(int j=2; j<=20; j++) {
             for(int i = 2; i < j; i++) {
                 if(j % i == 0) {
                    sayac++;
                 }  
             }
            if(sayac == 0) {
               sum=sum+j;
            }else {
               sayac=0;
            }
	    }
        
        System.out.println(sum);
	}
}
