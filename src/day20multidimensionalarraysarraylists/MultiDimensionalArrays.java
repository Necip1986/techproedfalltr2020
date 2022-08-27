package day20multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		
		int ma[][] = { {11,5}, {7}, {21,17,28}, {10,10}};
		System.out.println(Arrays.deepToString(ma)); 
		
		System.out.println(Arrays.toString(ma[2])); //index'i 2 olan ic array
		System.out.println(ma[2][1]); //17 verir. array'leri yazdirirken toString kullaniriz sayilar icin kullanmayiz
		
		//ma multidimensional array'inin tum elemanlarini ayni satirda aralarina bosluk birakarak yazdiriniz
		
		for (int i = 0; i < ma.length; i++) {
			for (int j = 0; j < ma[i].length; j++) {
				System.out.print(ma[i][j]+" ");
			}
		}

		System.out.println();
		//ma multidimensional array'inin tum elemanlarinin toplamini ekrana yazdiran programi yazdiriniz
	
		int sum=0;	
		for (int i = 0; i < ma.length; i++) {
			for (int j = 0; j < ma[i].length; j++) {
				sum+=ma[i][j];
			}
		}
		System.out.println("ma MD Array'inin tum elemanlarinin toplami: "+sum);
		
		//ma multidimensional array'inin tum elemanlarinin carpimini ekrana yazdiran programi yazdiriniz ODEV
		
		int carpim=1;
		for(int i=0; i<ma.length; i++) {
			for(int k=0; k<ma[i].length; k++) {
				carpim*=ma[i][k];
			}
		}
		System.out.println("ma'nin tum elemanlarinin crapimi: "+carpim);
		
		
		//ma multidimensional array'inin tum elemanlarindan cift olanlarin karesini ekrana yazdiriniz ODEV
		
		for (int i = 0; i < ma.length; i++) {
			for (int j = 0; j < ma[i].length; j++) {
				if(ma[i][j]%2==0) {
					System.out.print(ma[i][j]*ma[i][j]+" ");
				}
			}
		}
		
		
	}	
}
