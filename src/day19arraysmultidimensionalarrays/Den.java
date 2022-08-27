package day19arraysmultidimensionalarrays;

public class Den {

	public static void main(String[] args) {
		
		int sub=0;
		int arr1[][] = { {1,2}, {3,4,5}, {6} };
		int arr2[][] = { {7,8,9}, {10,11}, {12} };
		
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i].length<=arr2[i].length) {
			    for(int k=0; k<arr1[i].length;k++) {
				sub=arr1[i][k]+arr2[i][k];
				System.out.print(" " + sub);	
			}
		}else {
			for(int k=0; k<arr2[i].length;k++) {
				sub=arr1[i][k]+arr2[i][k];
				System.out.print(" " +sub);
			}
		}
	}
		
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
						if (i==j2 && j==k) {              //dis array ve ic array'lerin esit oldugu durumlarda caliscak sadece
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
