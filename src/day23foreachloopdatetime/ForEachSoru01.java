package day23foreachloopdatetime;

public class ForEachSoru01 {

	public static void main(String[] args) {
		/*
		   Asagida verilen multi=dimensional array'in elemanlari carpimini bulunuz
		 */
	
		int arr[][]= { {2,3}, {4,10}, {6,7}, {10,10,10} };
		
		int product=1;
		for(int[] w:arr) { //burada alacagim bir array oldugu icin int [] giriyoruz. ilk once dis array'in elemanlarini birer birer aliyoruz. yani arr[]
			for(int z: w) { //burada da ic array'in elemanlarini tek tek elde ediyoruz. yani arr[][]
				product*=z;
			}
		}
		System.out.println(product);
	}
}
