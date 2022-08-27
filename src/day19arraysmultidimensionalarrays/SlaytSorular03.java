package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class SlaytSorular03 {

	public static void main(String[] args) {
		//output nedir
		
		int arr[][] = new int[4][];
		System.out.println(Arrays.deepToString(arr));
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[4];
		System.out.println(Arrays.deepToString(arr));
		System.out.println(arr[0][0]);
		System.out.println(Arrays.toString(arr[0]));
	
		int i, j, k = 0;
		
		for(i=0; i<4; i++) {
			for(j=0; j<i+1; j++) {
				arr[i][j] = k;
				k++;
			}
		}
		System.out.println(Arrays.deepToString(arr));
 
		for(i=0; i<4; i++) {
			for(j=0; j<i+1; j++) {
				System.out.print(" "+arr[i][j]);
				k++;
			}
			System.out.println();
			
		}
		System.out.println(k);
		
	}

}
