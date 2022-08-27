package day19arraysmultidimensionalarrays;

import java.util.Arrays;

@SuppressWarnings("unused")
public class SlaytSorular04 {

	public static void main(String[] args) {
		/*
		 * 1) Aşağıdaki multi dimensional array’in tum elemanlarının çarpımını ekrana yazdıran bir program yazınız.
           { {1,2,3}, {4,5,6} } 
		 */
		
		int arr[][]= {{1,2,3}, {4,5,6}};
		int carpim=arr[0][0]*arr[0][1]*arr[0][2]*arr[1][0]*arr[1][1]*arr[1][2];
		System.out.println(carpim);
		
		
		/*
		 * 2) Aşağıdaki multi dimensional array’in iç array’lerindeki son elemanların çarpımını ekrana yazdıran
              bir program yazınız { {1,2,3}, {4,5}, {6} } 
		 */
		int arr1[][] = {{1,2,3}, {4,5}, {6}};
		int sonCarpim=arr1[0][2]*arr1[1][1]*arr1[2][0];
		System.out.println(sonCarpim);
		
		/*
		 * 3) Aşağıdaki multidimensional array’lerin iç array’lerinde aynı index’e sahip elemanların toplamını
           ekrana yazdıran bir program yazınız. (Zor soru)
           arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} } 
		 */
		
		int array1[][]={ {1,2}, {3,4,5}, {6} };
		int array2[][]={ {7,8,9}, {10,11}, {12} };
		

        int toplam=0;
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j<array1[i].length; j++) {
				for (int j2 = 0; j2 < array2.length; j2++) {
					for (int k = 0; k < array2[j2].length; k++) {
						if (i==j2 && j==k) {
							toplam=array1[i][j]+array2[j2][k];
							System.out.println("dis array'lerde "+i+" indeksine sahip, ic array'lerde "+j+" index'ine sahip elemanlarin toplami "+toplam);
							toplam=0;
						}
					}
				}      
			}
		}
	}

}
