package day40lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaTekrar01 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
	    list.add(12);
	    list.add(9);
	    list.add(13);
	    list.add(4);
	    list.add(6);
	    list.add(2);
	    list.add(4);
	    list.add(12);
	    list.add(15);
	    
	  //listteki tek sayilari yazdir;
	  //Print all odd numbers from the list [12, 9, 13, 4, 6, 2, 4, 12, 15] by Functional Programming
	    list.stream().filter(t->t%2!=0).forEach(t->System.out.print(t+" "));
	    System.out.println();
	   
	   //6 ile 14 arasindaki tum sayilarin karesini ekrana yazdiriniz
	   list.stream().filter(t->t>6&&t<14).map(t->t*t).forEach(Lambda01::printEl);
	   System.out.println();
	   
	   //list'teki tek tamsayilarin karekoklerinin toplamini 
	    //ekrana yazdiriniz
	   double sum=list.stream().filter(t->t%2!=0).map(Math::sqrt).reduce(Double::sum).get();
	   System.out.println(sum);
	   System.out.println(list.stream().filter(t->t%2!=0).mapToDouble(Math::sqrt).sum());
	
	}

}
