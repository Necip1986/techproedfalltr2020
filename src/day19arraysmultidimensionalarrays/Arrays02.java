package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		/*
		   split() Metodu: string metodudur. faydalidir bilmek lazim. Stringleri parcalamada kullanilir
		 */

		String s = "Calis Bakalim zor mu?"; //space'lerden parcalicaz. space oldurucez hangi karakteri kullanirsak o olur
		                                    //parcalicaz ama bir yere koymadan kullanamayiz. Bunun icin array olusturulur
		String words1[]=s.split(" "); //stringe gidicek strinlerden parcalicak
		
		System.out.println(Arrays.toString(words1)); //dort tane kelime oldu [Calis, , Bakalim, zor, mu?] virguller arasinda hicbirsey olur
		                                             //gramer kuraliyla bosluk olur ciktida
		
		//bir kitapta kelime sayisi bulunabilir gunluk hayatta.
		System.out.println(words1.length);//kelime sayisini verir
		
		//iki space koyunca kelime sayisi 5 olur her space den kestigi icin

		//s stringinde kac karakter kullanilmistir
		String words2[]=s.split("");
		System.out.println(Arrays.toString(words2));
		System.out.println(words2.length); //karakter sayisini bulmak icin hicbirseyden keseriz
		
		//s stringinde bosluk haric kac karakter kullanilmistir. Split ile bulunuz
		
		String words3[] = s.replace(" ", "").split("");
		System.out.println(Arrays.toString(words3));
		System.out.println("Bosluk haric character sayisi: "+words3.length);
		
		//s stringinde kac tane a karakteri vardir
		String words4[]=s.split("a");
		System.out.println(words4.length);
		System.out.println(" a karakter sayisi: "+(words4.length-1));
		
		//ustteki yanlis. asagidaki her durum icin calisir
		String word4[]=s.split("");
		int counter=0;
		
		for (int i = 0; i < word4.length; i++) {
			if (word4[i].equals("a")) {
				counter++;
			}
		}
		System.out.println("Sorulan karakterin sayisi: "+counter);
		
		//bir stringde kullanilan tum harflerin sayisini gosteren kodu yaziniz
		//Alaaddin ==> A=1, l=1, a=3, d=2, i=1, n=1
	}

}
