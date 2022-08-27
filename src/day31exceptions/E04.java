package day31exceptions;

public class E04 {

	/*
	   ArrayIndexOutOfBoundsException// array'in index'inin disindasin hatasi
	   un-checked exception'dir. Yani run time exception'dir.
	 */
	public static void main(String[] args) {

		int arr[] = {11,12,13};
		
		System.out.println(arr[0]); 
		
		try {
			System.out.println(arr[4]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array'de var olmayan bir index kullaniyorsunuz");
		}
		
		
	//	System.out.println(arr[4]);//index 3 yok java exception verir


	}

}
