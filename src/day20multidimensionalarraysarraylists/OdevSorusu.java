package day20multidimensionalarraysarraylists;

import java.util.Arrays;

public class OdevSorusu {

	public static void main(String[] args) {
		/*
		 * 4) Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların toplamını birer birer bulan
              ve herbir sonucu yeni bir array’in elemanı yapan ve yeni array’i ekrana yazdıran bir program yazınız
              { {1,2,3}, {4,5}, {6,7} }
              Ornegin; { {1,2,3}, {4,5}, {6,7} }  ==> 1+2+3=6  4+5=9  6+7=13  ==>  output: {6, 9, 13}
		 */

		int arr[][]={ {1,2,3}, {4,5}, {6,7} };
		
		int sum=0;
		int sonuc[]=new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum=sum+arr[i][j];
			}
			sonuc[i]=sum;
			sum=0;
		}
		System.out.println(Arrays.toString(sonuc));
	}
}
