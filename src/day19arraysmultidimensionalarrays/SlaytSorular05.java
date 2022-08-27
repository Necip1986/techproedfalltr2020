package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class SlaytSorular05 {

	public static void main(String[] args) {
		/*
		 * ) Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların toplamını birer birer bulan
             ve herbir sonucu yeni bir array’in elemanı yapan ve yeni array’i ekrana yazdıran bir program yazınız
             { {1,2,3}, {4,5}, {6,7} }
             Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
		 */

		int arr1[][] =  { {1,2,3}, {4,5}, {6,7} };
		
		int temp[] = new int[arr1.length];
		
		int toplam=0;
		
		for (int i = 0; i < arr1.length; i++) {
			toplam=0;
			for (int j = 0; j < arr1[i].length; j++) {
				toplam=toplam+arr1[i][j];
				temp[i]=toplam;
			}	
		}
		System.out.println(Arrays.toString(temp));
	}

}
