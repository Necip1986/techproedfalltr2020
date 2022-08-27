package day13whileloop;

public class Forloop02 {

	public static void main(String[] args) {
		/*
		 * Forloop kullanarak asagidaki sekli olusturunuz
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 *  bize 5 satir verilmis * koyup alta gecme bu loop demektir.
		 */

		for(int i=1; i<=5; i++) { //i satir sayisini gosteriyor
			for(int k=1; k<=i; k++ )  {         //k * sayisini gosteriyor.
		          
				System.out.print("*");	
			}
			
			System.out.println();
			}
	}

}
