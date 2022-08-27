package day18staticblockarrays;

import java.util.Scanner;
import java.util.Arrays;


public class Test {

	
	
	public static void main(String[] args) {
		int count=0;
		Scanner scan=new Scanner(System.in);
	    System.out.println("Bir String giriniz");
	    String str=scan.nextLine().toLowerCase();
        String dizi[]=str.replace(" ","").split("");
        
        System.out.println(Arrays.toString(dizi));
       
        
         for (int k = 0; k < dizi.length; k++) {
			
			for (int j = 0; j < dizi.length; j++) {
				
				if (dizi[j].equals(dizi[k])) {
					count++;
				}
			}
        System.out.print(dizi[k] +" =" + count+"  ");
			count=0;
		}
         scan.close();

	}

}
