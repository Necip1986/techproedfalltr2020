package day22listforeachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		
		/*  1- for-each-loop for-loop'un gelistirilmis halidir.
		      yazmasi kolay
		      okumasi kolay
		      hata yapma ihtimali daha az
		 */
		//Integer List olusturun, 5 elemanli ve elemanlari 1'er 1'er ayni satira 
		//aralarina bosluk birakarak yazidirn
		
		List<Integer>ls = new ArrayList<>();
		ls.add(3);
		ls.add(2);
		ls.add(1);
		ls.add(5);
		ls.add(4);
		
		//for-loop
		for (int i = 0; i < ls.size(); i++) {
			System.out.print(ls.get(i)+" ");
		}

		System.out.println();
		//for-each-loop
		for(Integer w : ls) {  //data tipi w ve : herzaman yazilir
			System.out.print(w+" ");
		}
		System.out.println();
		
		//for=each=loop kullanarak ls list'indeki tum elemanlarin toplamini bulunuz
		int toplam=0;
		for(Integer w: ls) {
			toplam+=w;
		}
		System.out.println(toplam);
		
        //ilk 2 eleman haric diger elemanlari ekrana yazdiriniz
		for(Integer w:ls.subList(2, ls.size())) {  //istedigimiz index'ten baslayabiliriz sublist ile
			System.out.print(w+" ");
		}
		System.out.println();
		
		//index'i 1 olan elemandan indexi 3 olan elemana kadar tum elemanlari yazdiriniz
		for(Integer w:ls.subList(1, 4)) {
			System.out.print(w+ " ");
		}
		System.out.println();
		
		//ls list'indeki elemanlardan tek sayi olanlari yazdirmayin
		//1.yol
		for (Integer w:ls) {
			if(w%2==0) {
				System.out.print(w+" ");
			}
		}
		System.out.println();
		//keyword==terim demek: ***continue keyword'u
		//2.yol
		for(Integer w:ls) {
			if(w%2!=0) {
				continue;  //gec o elemani demek
			}
			System.out.print(w+" ");
		}
		//continue kullandigimizda continue nin sartini saglayan isleme tabi tutulmaz. mesela 5'i sayma dersek continue kullanirsak 5 isleme
		//tabi tutulmaz
		
		System.out.println();
		
		//***break keyword'u
		//ls list'indeki 5'e kadar elemanlari 5 gorunceye kadar yazdirin(5 yazilmasin)
		for (Integer w:ls) {
			if(w==5) {
				break;
			}
			System.out.print(w+ " ");
		}
		//break 5 gorunce sistemi durdurur. break butun loop'lari kirar(durdurur). Belli sartlara bagli olarak break dongunun disina atar
		//NOT: continue belli sartlara gore bazi elemanlari islem disi tutmak icin kullanilir. break ise belli sartlara gore 
		//loop'u kirmak icin kullanilir
	}

}
