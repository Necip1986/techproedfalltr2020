package day32exceptions;

public class E03 {

	/*
	   printStackTrace() olusan exception'in tum detaylarini verir. Detayli bir hata mesaji consolda
	   almak isterseniz printStackTrace()" kullaniriz.
	 */
	public static void main(String[] args) {


		int arr[]= {11, 12, 13, 14};
		
		try {
		
			System.out.println(arr[4]);

		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(); //izleri yazdir kodu. bunu genelde developer'lar yazar
		                         //bu methodu zaten print ediyor syso'nun icine koymaya gerek yok
		}
	}

}
