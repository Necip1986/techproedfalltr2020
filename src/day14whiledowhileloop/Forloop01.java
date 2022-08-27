package day14whiledowhileloop;

import java.util.Scanner;

public class Forloop01 {

	public static void main(String[] args) {
		/*
        Satir sayisini kullanicidan alarak asagidaki gibi sekil olusturunuz
                  *******
                   *****
                    ***
                     *
                     ilk sonce spaceleri gormek icin kare icine aliyoruz
       */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen satir sayisini giriniz");
		int s=scan.nextInt();
		
		//ilk once satir sayisi
		for(int i=0; i<s; i++) {
			for(int k=0; k<i; k++) {
				System.out.print(" "); //ayni satira yazmasi icin ln kaldiriyoruz
			}
			for(int m=1; m<2*(s-i); m++) {
				System.out.print("*");
			}
			System.out.println();
		}

		scan.close();
	}

}
