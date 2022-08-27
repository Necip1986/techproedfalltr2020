package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 { //cok boyutlu array

	public static void main(String[] args) {
		/*
		 * array icinde array nested array de denir
		 */

		//multidimensional array'ler nasil olusturulur
		int ma[][]=new int[3][2]; //ilk array distaki
		
		//multidimensional array'ler ekrana nasil yazirilir
		Arrays.deepToString(ma); //multidimentional larda toString yerine deepToString kullanilir ekrana yazdirmak icin
		System.out.println(Arrays.deepToString(ma)); //[[0, 0], [0, 0], [0, 0]] atama yapmadigi icin default degerler gorulur
		
		//multidimensional array'lere Eleman ekleme nasil yapilir
		ma[0][0]=33;
		System.out.println(Arrays.deepToString(ma));
		
		ma[1][1]=24;
		System.out.println(Arrays.deepToString(ma));
		ma[0][1]=32;
		ma[1][0]=23;
		ma[2][0]=13;
		ma[2][1]=11;
		System.out.println(Arrays.deepToString(ma));
		
		//ic array'ler nasil ekrana yazidirilir.
		//[23,24] array'ini ekrana yaziriniz. ma[1] orayi verir 
		Arrays.toString(ma[1]);
		System.out.println(Arrays.toString(ma[1])); //ic array i ekrana yazdirdik
		
		//Multidimensional array'lerde istenen bir eleman nasil yazdirilir. mesela 13 u yazdirmak istiyoruz
		
		System.out.println(ma[2][0]); //toString arrayleri yazdirmak icin kullanilir burada 13 bir sayidir.
		
		//24'u yazdiralim
		System.out.println(ma[1][1]);
		
	}

}
