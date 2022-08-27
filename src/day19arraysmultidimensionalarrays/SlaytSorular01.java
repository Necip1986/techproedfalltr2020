package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class SlaytSorular01 {

	public static void main(String[] args) {
		
		String str[]= {"A", "C", "B", "D"};
		Arrays.sort(str);
		System.out.println(Arrays.binarySearch(str, "A")); //A'nin indexini verir. 0'dir
		System.out.println(Arrays.binarySearch(str, "C")); //2 verir
		System.out.println(Arrays.binarySearch(str, "E")); //-5 verir olsaydi kacinci karakter olurdu ona bakiyor java
		System.out.println(Arrays.binarySearch(str, "G")); //olsaydi 5'inci karakter olurdu -5 return eder

		int arr1[] = {2,3,0,4};
		int arr2[] = {2,3,0,4};
		System.out.println(Arrays.equals(arr1, arr2)); //true verir
		int arr3[] = {3,0,2,4};
		System.out.println(Arrays.equals(arr1, arr3));//false verir rakamlar ayni olsa da dizilim farkli
		
		//eger sort edilirse rakamlar ayni ise true verir
		Arrays.sort(arr1);
		Arrays.sort(arr3);
		System.out.println(Arrays.equals(arr1, arr3)); // sort edildikten sonra true verir
		
		if (Arrays.equals(arr1, arr3)) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		//program calisinca i'nin degeri ne olur
		int[] x= {2,1,4,5,7};
		int limit=3;
		int i=0;
		int sum=0;
		
		while((sum<limit)&&(i<x.length)) {
			i++;
			sum=sum+x[i];
		}	
		System.out.println(i);
		System.out.println(sum);
		
		//program calistiktan sonra "x1'in elemanlari ne olur
		int[] x1= {0,1,2,3};
		int temp;
		int i1=0;
		int j=x1.length-1;
		
		while(i1<j) {
			temp=x1[i1];
			x1[i1]=x1[j];
			x1[j]=2*temp;
			i1++;
			j--;
		}
		System.out.println(Arrays.toString(x1));
		
		
	}

}
