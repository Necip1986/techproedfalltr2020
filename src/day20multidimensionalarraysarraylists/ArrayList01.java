package day20multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {

		/*
		  1-Listler primitive data type'leri kabul etmez. Primitive'ler yerine wrapper class'lari
		    kullaniriz
		 */

		//ArrayList Olusturma
		
		//1.yol. ArrayList'ler non primitive'leri kabul ederler. primitive'leri wrapper classlari kullanilir
		// ArrayList <Integer> list1 = new ArrayList<Integer>();  //diamond isareti icine data tipi yazilir. ArrayList syntax'i=soz dizimi
       
		//aksi soyleninceye kadar sadece java util'den import yapiyoruz
		 
		 //2. Yol
		// ArrayList <Integer> list2 = new ArrayList<>(); 
		 
		 //3. yol Recommended
		 List <Integer> list3 = new ArrayList<>(); 
		 
		 //Listleri consola yazdirma
		 System.out.println(list3); //sadece List'in ismi yazdirilir ve [] yazdirir bisey koymadim diye
		 
		 //List'e eleman ekleme
		 list3.add(12);
		 System.out.println(list3); //[12] yazdirir
		 
		 list3.add(13);
		 System.out.println(list3); //consol'da array'ler gibi gozukur  [12,13]
		                            //ilk eklenen basa yaziyor. bizim giris siramiza gore siraliyor
		 
	}

}
