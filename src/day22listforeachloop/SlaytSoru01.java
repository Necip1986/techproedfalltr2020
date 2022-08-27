package day22listforeachloop;

import java.util.ArrayList;
import java.util.List;

public class SlaytSoru01 {

	public static void main(String[] args) {
		/*
		 * For-each loop Soru 1:
           Bir integer array oluşturunuz ve bu array’deki tum sayıların çarpımını
           For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
		 */

		int arr[]= {1,2,3,6,7,8,10};
		int product=1;
		for(Integer w:arr) {
			product*=w;
		}
		System.out.println("Array'deki tum sayilarin carpimi: " + product);
		
		/*
		  For-each loop Soru 2:
	      Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin toplamını
	      For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
		 */
		List<Integer>ls=new ArrayList<>();
		ls.add(5);
		ls.add(10);
		ls.add(2);
		
		int sum=0;
		for(Integer w:ls) {
			sum+=w*w;
		}
		System.out.println("List'in elemanlarinin karesinin toplami: "+sum);
	}
}
