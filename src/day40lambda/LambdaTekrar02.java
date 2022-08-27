package day40lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaTekrar02 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Mariano");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Christ");
        
        //list'teki isimlerden "a" ve "e" icerenlerin harf sayilarinin toplamini ekrana yazdiriniz
        System.out.println(list.stream().
        		filter(t->t.toLowerCase().contains("a")&&t.toLowerCase().contains("n")).
        		mapToInt(t->t.length()).
        		sum());
        
        //list'teki isimlerden ilk harfi son harfinden alfabetik olarak onde olan isimleri ekrana yazdiriniz
        list.stream().
        filter(t->t.toLowerCase().charAt(0)<t.toLowerCase().charAt(t.length()-1)).
        forEach(System.out::println);
        
        //
        

	}

}
