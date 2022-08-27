package day40lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Lambda09 {

	public static void main(String[] args) throws IOException {
		
		//FileForLambda dosyasini okuyunuz (konsola yazdiriniz)
		Files.lines(Paths.get("src/day40lambda/FileForLambda")).forEach(System.out::println);
		//lines satirlar demek stream olarak mesajlar akiyor biz for each ile yazdiriyoruz.

		//FileForLambda dosyasini buyuk harflerle okuyunuz (konsola yazdiriniz)
	
		Files.lines(Paths.get("src/day40lambda/FileForLambda")).map(String::toUpperCase).forEach(System.out::println);
	                //bu kisim path'i kullanarak file'a ulasiyor lines stream ile ayni calisir
		
		//FileForLambda dosyasindaki ilk satiri kucuk harflerle okuyunuz//limit kullanilabilir
		//1.yol
		Files.lines(Paths.get("src/day40lambda/FileForLambda")).limit(1).map(String::toLowerCase).forEach(System.out::println);
		
		//2.yol
		System.out.println(Files.lines(Paths.get("src/day40lambda/FileForLambda")).map(String::toLowerCase).findFirst());
		
		//FileForLambda dosyasinda lambda kelimesinin kac satirda gectigini ekrana yazdiran programi yaziniz
		System.out.println(Files.lines(Paths.get("src/day40lambda/FileForLambda")).filter(t->t.toLowerCase().contains("lambda")).count());
		//2 satirda Lambda kelimesi geciyor.
		
		//FileForLambda dosyasinda tum farkli kelimeleri bir list'in icinde ekrana yazdiriniz
		System.out.println(Files.
				lines(Paths.get("src/day40lambda/FileForLambda")).
				map(t->t.split(" ")).flatMap(Arrays::stream).
				distinct().
				collect(Collectors.toList()));
	    System.out.println("=================");
		//FileForLambda dosyasinda tum kelimeleri natural order olarak ekrana yazdiriniz.
	    Files.
		lines(Paths.get("src/day40lambda/FileForLambda")).
		map(t->t.toLowerCase().split(" ")).flatMap(Arrays::stream).
		sorted().forEach(t->System.out.print(t+" "));
	    System.out.println();
	    
	  //ODEV:Butun file'da kac tane lambda kelimesi geciyor.Buyuk harf kucuk harf onemsemeden ekrana yazdiran programi yaziniz
	  		System.out.println(Files.
	  				                 lines(Paths.get("src/day40lambda/FileForLambda")).
	  		                         map(t->t.toLowerCase().split(" ")).
	  		                         flatMap(Arrays::stream).
	  		                         filter(t->t.equals("lambda")).
	  		                         count());
	  		
	  //FileForLambda dosyasinda icinde "m" harfi gecen kelimelerin sayisini ekrana yazdiran programi yaziniz
	  		System.out.println(Files.
		              lines(Paths.get("src/day40lambda/FileForLambda")).
                      map(t->t.split(" ")).
                      flatMap(Arrays::stream).
                      filter(t->t.contains("m")).
                      count());
	  	//FileForLambda dosyasinda icinde "m" harfi gecen kelimeleri ekrana yazdiran programi yaziniz
	  		Files.
            lines(Paths.get("src/day40lambda/FileForLambda")).
            map(t->t.split(" ")).
            flatMap(Arrays::stream).
            filter(t->t.contains("m")).
            forEach(System.out::println);
	  		
	  	//FileForLambda dosyasinda kac farkli harf kullanildigini gosteren programi yaziniz
	  		System.out.println(Files.
            lines(Paths.get("src/day40lambda/FileForLambda")).
            map(t->t.replaceAll("\\W", "").split("")). //bu kod bana array'ler veriyor
            flatMap(Arrays::stream). //array'lerdeki herbir elemani almak icin flatMap methodu kullanilir.
            count()); //ekrana yazdirmak syso'nun icine koymam lazim

	   //FileForLambda dosyasinda kac farkli kelime kullanilmistir //sonra bunlari yazdirabilirz foreach ile
	  		System.out.println(Files.
	  	            lines(Paths.get("src/day40lambda/FileForLambda")).
	  	            map(t->t.replaceAll("[.?!,]", "").split(" ")).//noktalama isaretleri replace ettik
	  	            		flatMap(Arrays::stream).
	  	            		distinct().
	  	            		count());
	  	            		
	  	
	  		
	  		
	  		
	}

}
