package day22listforeachloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSoru01 {

	public static void main(String[] args) {
		/*
		 * Elemanlarini kullanicinin girdigi bir String list olusturunuz.
		 * String'lerin tamami rakamlardan olussun
		 * Bu list'in elemanlarinin carpimini ekrana yazdiriniz
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		String str="";
		
		List<String>list=new ArrayList<>();
        
        do {
        	System.out.println("Rakamlardan olusan String'ler giriniz\nString girmeyi durdurmak icin 'S' giriniz");
        	str=scan.nextLine();
        	if(!str.equals("S")) {
        	   list.add(str);
        	}
        }while(!str.equals("S"));
       
        System.out.println(list);
        
        int product=1;   //product carpim demek
        for(int i=0; i<list.size(); i++) {
        	product=product*Integer.parseInt(list.get(i));
        }
        System.out.println(product);

        scan.close();
	}
}
