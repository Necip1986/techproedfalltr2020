package day34interface;

import java.lang.reflect.Array;

public class Runner {

	public static void main(String[] args) {
		
//		Civic c1 = new Civic();
//		c1.hareket();
//		c1.benzin();
//		c1.koltuk();
//		c1.direksiyon();
//		c1.ayna();
//		c1.far();
//		c1.kaporta();
//		c1.garanti();
//		c1.jant();
//		
//		//Asagidaki kod CTE verir. Cunku interface'lerdeki tum variable'lar otomatik 
//		//olarak final olurlar ve final variable'larin degerleri degistirilemez.
//		//c1.FIYAT= 30000; //degistirilemez CTE verir. variable'lara field da denir
//		
//		//fiyat'a interface'nin ismiyle ulasabilir miyim
//		System.out.println(IcDonanim.FIYAT); // evet ulasabilirim.
//
//		//biz instance variable'lara obje ile ulasabilirdik class ismi ile static variable'lata ulasabilirdim
//		//fiyat variable'ina "interface ismi ile ulasabiliriz. Object uretmeye gerek yok. Demek ki:
//		//interface'lerdeki variable'lar static'tir.
//		//Interface'deki tum class member'lar "public"tir. oyleyse interface'deki variable'lar public static ve final'dir.
//		
//		//ayni isimli ayni data tipli variable'lar parent interface'lerde olusturulabilir. Ama ayni isimli variable'lari object
//		//kullanarak cagirirsaniz java hangisini sececegine karar veremez. ve CTE verir. Asagidaki gibi.
//		//CTE almamak icin ayni isimli variable'lar kesinlikle "interface" isimleri kullanilarak cagrilmalidir.
//		//zaten interface'deki tum variable'lar static oldugundan dogrusu variable'lari interface ismiyle cagirmaktir.
//		//Java static'leri obje ile cagirinca sari alt cizgi verirdi.
//		//System.out.println(c1.MARKA);//javanin kafasi karisti karar veremedi hangisini sececegine
//		
//		System.out.println(IcDonanim.MARKA); //sikint olmaz honda verir consola
//		System.out.println(DisDonanim.MARKA);//Mazda verir CTE yok
//		System.out.println(Lastik.MARKA);//Audi verir consola
//		 
//		
		int arr[]=new int[3];
		arr[1]=12;
		
		
	}

}
