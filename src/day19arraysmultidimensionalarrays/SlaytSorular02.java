package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class SlaytSorular02 {

	public static void main(String[] args) {
		//Program calistirildiktan sonra "count'un degeri ne olur.
		int[]x1= {0,1,2,3};
		int[]x2= {1,2,2,3};
		int i1=0;
		int i2=0;
		int count=0;
		
		while((i1<x1.length)&&(i2<x2.length)) {
			if(x1[i1]==x2[i2]) {
				count++;
				i2++;
			}else if(x1[i1]<x2[i2]) {
				i1++;
			}else {
				i2++;
			}
		}

		System.out.println(count);
		System.out.println(i1+" , "+i2);
		
		String str="Java'yi, sevdiniz mi?";
		String arr1[]=str.split(",");
		System.out.println(Arrays.toString(arr1)); //[Java'yi,  sevdiniz mi?]
		
		//Multidimentional Array'ler
		int arr[][]= {{1,2},{3,4},{5,6}};
		System.out.println(arr[0][0]);//1 verir
		System.out.println(Arrays.toString(arr[0]));//[1,2] verir
		
		
		
	}

}
