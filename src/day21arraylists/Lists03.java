package day21arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists03 {

	public static void main(String[] args) {
		
		//Array'i List'e cevirmek
		
		String arr[]= {"Ali", "Veli", "Canan", "Kemal"};
		//arr[] array'ini list'e donusturcem onun icin ilk hamlem yeni(temp) list olusturmak
		List<String> l1 = Arrays.asList(arr);  //burda list gibi yap demektir. Artik arr bir list oldu
		System.out.println(l1); //[Ali, Veli, Canan, Kemal] yazdirir
		//NOT array'i list'e cevirmek icin Arrays class'indan asList metodunu kullaniriz
		
		//l1'e yeni bir eleman ekleme
		//l1.add("Yahya"); //yahya'yi eklemez yazdirirsak hata verir. run time error
		System.out.println(l1); //java bunu desteklemez yani ekleme yapmaz
		//NOT array'den uretilen List'lerde size'i degistiren metodlar kullanilamaz yani add(), remove(), ve clear() kullanilamaz
		//kullanilirsa run time error verir .Unsupported error verir
		
		
		//List'i Array'e cevirmek . Bunun yapilabilidigini bilmek yeterlidir. Hersey google dan alinabilir ama ben temel olarak ne yapilabilecegini bilmem lazim
		String arrayFromList[] = l1.toArray(new String[0]); //parantez icine new String[0] koymak gerekir. 
		
		System.out.println(Arrays.toString(arrayFromList)); //artik array oldugu icin array'leri yazdirma yontemini kullaniyoruz
		
		//equals metodu ayni data tiplerini karsilastirir
		//NOT: remove() metodu Integer List'lerde kullanilirken remove() metodunun icine konulan deger her zaman index olarak alinir.
		//Eleman olarak dusunulmez
		List<Integer>l2 = new ArrayList<>();
		l2.add(5);
		l2.add(2);
		l2.add(4);
		l2.add(3);
		l2.add(1);
		System.out.println(l2);
		
		System.out.println(l2.remove(4)); //1'i siliyorum tamam mi diyor
		System.out.println(l2);
		Integer []a=l2.toArray(new Integer[0]);
		System.out.println(Arrays.toString(a));
	}

}
