package day22listforeachloop;

import java.util.Arrays;
import java.util.List;

public class SlaytSoru02 {

	public static void main(String[] args) {
		/*
		 * For-each loop Soru 3
           İki String array oluşturunuz ve bu array’lerdeki ortak elemanları
           For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
           Ortak eleman yoksa ekrana “Ortak eleman yok” yazdırınız
		 */

		String arr1[]= {"Ali", "Mehmet", "Yahya"};
		String arr2[]= {"Hava", "Su", "Toprak", "Ates","Mehmet"};
		
		int flag=0;
		for(String w1:arr1) {
			for(String w2:arr2) {
				if(w1==w2) {
					System.out.println("Ortak eleman: "+w1);
					flag++;
				}
			}
		}
		if(flag==0) {
			System.out.println("Ortak eleman yok");
		}
		
		/*
		 * For-each loop Soru 4:
           Bir String oluşturunuz, bu String’deki character’leri yukarıdan aşağıya
           for-each loop kullanarak yazdırınız.
           İpucu: split()
		 */
		String str="Tekrar et unutma";
		String s[]=str.replaceAll(" ", "").split("");
		for(String w:s) {
			System.out.println(w);
		}
		
		/*
		 * array'i liste cevirme
		 */
		
		String arr[]= {"hawk","robin"};
		List<String>ls=Arrays.asList(arr);
		System.out.println(ls);
		System.out.println(ls.size());
		
		//Note: Eğer array’deki bir elemanı değiştirirseniz listteki eleman da otomatik olarak değişir.
		//Listteki bir elemanı değiştirirseniz array de otomatik olarak değişir.
		ls.set(1, "mehmet"); //System.out.println(ls.set(1, "mehmet")); yaparsak consolde silinecek olan robin gorunur
		System.out.println(ls);
		System.out.println(Arrays.toString(arr));
	}

}
